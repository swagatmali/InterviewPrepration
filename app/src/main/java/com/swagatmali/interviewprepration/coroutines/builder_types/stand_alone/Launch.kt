package com.swagatmali.interviewprepration.coroutines.builder_types.stand_alone

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    println("Main Program Start")
    launch {
        //launch follows fire and forgot approach..not interested in result
        //No thread block
        println(getUserInfo("Swagat"))
    }
    println("Main Program End")
}

suspend fun getUserInfo(str: String): String {
    delay(1000)
    return str
}