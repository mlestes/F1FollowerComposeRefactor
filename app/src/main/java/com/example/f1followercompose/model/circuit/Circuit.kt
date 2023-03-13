package com.example.f1followercompose.model.circuit

import com.example.f1followercompose.model.Location

data class Circuit(
	val Location: Location,
	val circuitId: String,
	val circuitName: String,
	val url: String
)