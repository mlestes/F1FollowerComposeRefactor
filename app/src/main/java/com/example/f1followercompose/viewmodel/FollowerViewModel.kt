package com.example.f1followercompose.viewmodel

import androidx.lifecycle.*
import com.example.f1followercompose.component.FollowerRepository
import com.example.f1followercompose.model.MRData
import com.example.f1followercompose.util.Event
import com.example.f1followercompose.util.EventBus
import com.example.f1followercompose.util.Logger
import com.example.f1followercompose.util.State
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch

class FollowerViewModel: ViewModel(), DefaultLifecycleObserver {
	
	private val repository = FollowerRepository()
	private val eventBus = object: EventBus<Event> {
		private val mutableEvent = MutableSharedFlow<Event>()
		override val events: SharedFlow<Event>
			get() = mutableEvent.asSharedFlow()
		override val count: StateFlow<Int>
			get() = mutableEvent.subscriptionCount
		
		override suspend fun publish(event: Event) {
			mutableEvent.emit(event)
		}
	}
	
	val data = MutableLiveData<MRData>()
	val status = MutableLiveData(State.READY)
	
	private fun updateData(newData: MRData) {
		data.postValue(newData)
		status.postValue(State.READY)
	}
	
	private fun handleError(errorMsg: String, e: Exception) {
		Logger.e(errorMsg, e)
		status.postValue(State.ERROR)
	}
	
	private suspend fun getResponse(path: String) {
		status.postValue(State.LOADING)
		repository.getResponse(path).also { updateData(it.data) }
	}
	
	private suspend fun getCurrentDriverStandings() {
		try {
			getResponse("current/driverStandings")
		} catch (e: Exception) {
			handleError("failed to fetch current standings", e)
		}
	}
	
	private suspend fun getCurrentConstructorStandings() {
		try {
			getResponse("current/constructorStandings")
		} catch (e: Exception) {
			handleError("failed to fetch current standings", e)
		}
	}
	
	private suspend fun getCurrentRaceSchedule() {
		try {
			getResponse("current")
		} catch (e: Exception) {
			handleError("failed to fetch current schedule", e)
		}
	}
	
	private suspend fun getMostRecentRaceResult() {
		try {
			getResponse("current/last/results")
		} catch (e: Exception) {
			handleError("failed. fetch last race result", e)
		}
	}
	
	private val eventBlock: suspend CoroutineScope.() -> Unit = {
		eventBus.events.collect { event ->
			Logger.d("new event: $event")
			when(event) {
				is Event.CurrentDriverStandings -> { getCurrentDriverStandings() }
				is Event.CurrentConstructorStandings -> { getCurrentConstructorStandings() }
				is Event.CurrentRaceSchedule -> { getCurrentRaceSchedule() }
				is Event.MostRecentRaceResult -> { getMostRecentRaceResult() }
				else -> { Logger.e("Unidentified event passed") }
			}
		}
	}
	
	fun triggerEvent(event: Event) = viewModelScope.launch { eventBus.publish(event) }
	
	override fun onCreate(owner: LifecycleOwner) {
		with(owner.lifecycleScope) {
			launch(block = eventBlock)
		}
	}

}