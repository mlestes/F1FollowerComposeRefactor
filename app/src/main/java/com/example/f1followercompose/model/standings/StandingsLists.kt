package com.example.f1followercompose.model.standings

import com.google.gson.annotations.SerializedName

data class StandingsLists(
    val round: String,
    val season: String,
    @SerializedName("DriverStandings")
    val driverStandings: List<DriverStanding> = emptyList(),
    @SerializedName("ConstructorStandings")
    val constructorStandings: List<ConstructorStanding> = emptyList()
)