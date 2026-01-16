package com.swagatmali.interviewprepration.coroutines.builder_types.scoped

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    println("Start")
    coroutineScope {
        launch {
            println(getUserInfo1("Swagat"))
        }
        launch {
            throw RuntimeException("Error")
        }
        // next child will not execute because 'coroutineScope' skip the next part if error thrown
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