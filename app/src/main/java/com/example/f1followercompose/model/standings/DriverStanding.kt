package com.example.f1followercompose.model.standings

import com.example.f1followercompose.model.constructor.Constructor
import com.example.f1followercompose.model.driver.Driver
import com.google.gson.annotations.SerializedName

data class DriverStanding(
    @SerializedName("Constructors")
    val constructors: List<Constructor>,
    @SerializedName("Driver")
    val driver: Driver,
    val points: String,
    val position: String,
    val positionText: String,
    val wins: String
)