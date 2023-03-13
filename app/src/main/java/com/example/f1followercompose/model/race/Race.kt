package com.example.f1followercompose.model.race

import com.example.f1followercompose.model.circuit.Circuit
import com.google.gson.annotations.SerializedName

data class Race(
	@SerializedName("Circuit")
	val circuit: Circuit,
	val date: String,
	val raceName: String,
	val round: String,
	val season: String,
	val time: String,
	val url: String,
	@SerializedName("Results")
	val results: List<Result> = emptyList(),
	@SerializedName("QualifyingResults")
	val qualifyingResults: List<QualifyingResult> = emptyList()
)