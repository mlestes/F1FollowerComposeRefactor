package com.example.f1followercompose.model.race

import com.example.f1followercompose.model.constructor.Constructor
import com.example.f1followercompose.model.driver.Driver
import com.google.gson.annotations.SerializedName

data class Result(
	@SerializedName("Constructor")
	val constructor: Constructor,
	@SerializedName("Driver")
	val driver: Driver,
	@SerializedName("FastestLap")
	val fastestLap: FastestLap,
	@SerializedName("Time")
	val time: Time,
	val grid: String,
	val laps: String,
	val number: String,
	val points: String,
	val position: String,
	val positionText: String,
	val status: String
)