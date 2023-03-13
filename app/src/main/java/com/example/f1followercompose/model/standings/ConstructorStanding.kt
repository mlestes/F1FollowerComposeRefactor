package com.example.f1followercompose.model.standings

import com.example.f1followercompose.model.constructor.Constructor
import com.google.gson.annotations.SerializedName

data class ConstructorStanding(
    @SerializedName("Constructor")
    val constructor: Constructor,
    val points: String,
    val position: String,
    val positionText: String,
    val wins: String
)