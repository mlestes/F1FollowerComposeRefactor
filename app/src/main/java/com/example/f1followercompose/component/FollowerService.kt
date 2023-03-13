package com.example.f1followercompose.component

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface FollowerService {
	
	@GET("{path}.json")
	fun getResponse(@Path("path") query: String): Response<FollowerResponse>
}