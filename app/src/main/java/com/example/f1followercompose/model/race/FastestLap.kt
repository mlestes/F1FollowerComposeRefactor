package com.example.f1followercompose.model.race

import com.google.gson.annotations.SerializedName

data class FastestLap(
	@SerializedName("AverageSpeed")
	val averageSpeed: AverageSpeed,
	@SerializedName("Time")
	val time: Time,
	val lap: String,
	val rank: String
)