package com.example.f1followercompose.model.race

import com.google.gson.annotations.SerializedName

data class RaceTable(
	@SerializedName("Races")
	val races: List<Race>,
	val season: String,
	val round: String? = null
)