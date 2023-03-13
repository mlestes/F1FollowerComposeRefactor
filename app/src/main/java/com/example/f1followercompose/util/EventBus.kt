package com.example.f1followercompose.util

import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow

interface EventBus<T> {
	val events: SharedFlow<T>
	val count: StateFlow<Int>
	suspend fun publish(event: T)
}

inline infix fun <P1, R> P1.pipe(t: (P1) -> R): R = t(this)
infix fun <P1, P2, R> P1.pipe2(t: (P1, P2) -> R): (P2) -> R = { p2 -> t(this, p2) }