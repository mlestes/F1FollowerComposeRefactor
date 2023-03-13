package com.example.f1followercompose.component

import com.example.f1followercompose.util.Logger

class FollowerRepository {
	
	private val client = FollowerClient()
	
	suspend fun getResponse(path: String): FollowerResponse = try {
		client.getResponse(path).body() ?: throw Exception("received null response")
	} catch (e: Exception) {
		Logger.e("$path returned null", e)
		throw e
	}
}