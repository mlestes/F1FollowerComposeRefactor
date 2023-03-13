package com.example.f1followercompose.component

import com.example.f1followercompose.util.BASE_URL
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class FollowerClient {
	
	private val retrofit = createRetrofit().create(FollowerService::class.java)
	
	private fun createRetrofit(): Retrofit = Retrofit.Builder()
		.baseUrl(BASE_URL)
		.addCallAdapterFactory(CoroutineCallAdapterFactory())
		.addConverterFactory(GsonConverterFactory.create())
		.build()
	
	suspend fun getResponse(query: String) = retrofit.getResponse(query)
}