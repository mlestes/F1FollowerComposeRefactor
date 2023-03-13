package com.example.f1followercompose.model.status

import com.google.gson.annotations.SerializedName

data class StatusTable(
    @SerializedName("Status")
    val status: List<FinishStatus>
)