package com.swagatmali.interviewprepration.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    //Cold flow emits when collector is available (ex -  water Tap )
    // new collector will values even old one has already emitted values
    fun coldFlow() = flow {
        repeat(3) {
            delay(200)
            emit(it)
        }
    }

    val coldFlow = coldFlow()

    launch {
        coldFlow.collect {
            println("First $it")
        }
    }
    delay(1000)

    launch {
        coldFlow.collect {
            println("Second $it")
        }
    }
}