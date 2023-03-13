package com.example.f1followercompose.model.constructor

import com.google.gson.annotations.SerializedName

data class ConstructorTable(
	@SerializedName("Constructors")
    val constructors: List<Constructor>
)