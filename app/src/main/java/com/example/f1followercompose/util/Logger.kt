package com.example.f1followercompose.util

import android.util.Log

class Logger {
	
	companion object {
		fun d(message: String) = Log.d(LOG_TAG, message)
		fun d(message: String, throwable: Throwable) = Log.d(LOG_TAG, message, throwable)
		fun d(throwable: Throwable) = Log.d(LOG_TAG, null, throwable)
		fun e(message: String, throwable: Throwable) = Log.e(LOG_TAG, message, throwable)
		fun e(message: String) = Log.e(LOG_TAG, message)
		fun e(throwable: Throwable) = Log.e(LOG_TAG, null, throwable)
		fun w(message: String) = Log.w(LOG_TAG, message)
		fun w(message: String, throwable: Throwable) = Log.w(LOG_TAG, message, throwable)
		fun w(throwable: Throwable) = Log.w(LOG_TAG, throwable)
	}
	
}