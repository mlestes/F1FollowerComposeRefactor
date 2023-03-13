package com.example.f1followercompose.util

sealed class Event {
	object CurrentDriverStandings: Event()
	object CurrentConstructorStandings: Event()
	object MostRecentRaceResult: Event()
	object CurrentRaceSchedule: Event()
}
