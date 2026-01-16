package com.swagatmali.interviewprepration.coroutines.builder_types.stand_alone

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    println("Start")
    runBlocking {
        //runBlocking will block the thread until the coroutine is finished
        //Mostly used for testing
        println(getUserInfo1("Swagat"))
        println(getUserInfo1("Mali"))
    }
    println("End")
}

suspend fun getUserInfo1(string: String): String {
    delay(1000)
    return string
}