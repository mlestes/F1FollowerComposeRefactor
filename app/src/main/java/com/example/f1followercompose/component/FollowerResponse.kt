package com.example.f1followercompose.component

import com.example.f1followercompose.model.MRData
import com.google.gson.annotations.SerializedName

data class FollowerResponse(
	@SerializedName("MRData")
	val data: MRData
)
