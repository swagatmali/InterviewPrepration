package com.swagatmali.interviewprepration.coroutines.builder_types.stand_alone

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    println("Start")
    val job = async {
        val user = getUser("Swagat")
        println(user)
    }
    job.await()

    //if the process is complete then we will the data. Before completion if we we use job.getCompleted()
    // then we will crash
    //job.getCompleted()

    println("End")

}

suspend fun getUser(str: String): String {
    delay(1000)
    return str
}