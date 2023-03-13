package com.example.f1followercompose.model.race

import com.example.f1followercompose.model.constructor.Constructor
import com.example.f1followercompose.model.driver.Driver
import com.google.gson.annotations.SerializedName

data class QualifyingResult(
	@SerializedName("Constructor")
    val constructor: Constructor,
	@SerializedName("Driver")
    val driver: Driver,
	@SerializedName("Q1")
    val q1: String,
	@SerializedName("Q2")
    val q2: String,
	@SerializedName("Q3")
    val q3: String,
	val number: String,
	val position: String
)