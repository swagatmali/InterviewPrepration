package com.swagatmali.interviewprepration.coroutines.builder_types.scoped

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.supervisorScope

fun main(): Unit = runBlocking {
    println("Start")
    supervisorScope {
        launch {
            println(getUserInfo1("Swagat"))
        }
        launch {
            throw RuntimeException("Error")
        }
        // next child will execute because 'supervisorScope' will still runs even if we get errors
        launch {
            println(getUserInfo1("Mali"))
        }
    }
    println("End")
}

private suspend fun getUserInfo1(string: String): String {
    delay(1000)
    return string
}