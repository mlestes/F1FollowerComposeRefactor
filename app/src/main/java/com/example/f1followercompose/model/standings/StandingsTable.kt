package com.example.f1followercompose.model.standings

import com.google.gson.annotations.SerializedName

data class StandingsTable(
    @SerializedName("StandingsLists")
    val standingsLists: List<StandingsLists>,
    val season: String
)