package com.example.f1followercompose.model.circuit

import com.google.gson.annotations.SerializedName

data class CircuitTable(
    @SerializedName("Circuits")
    val circuits: List<Circuit>
)