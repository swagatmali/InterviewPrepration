package com.swagatmali.interviewprepration.flow.hot_flows

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    //HotFlow - even emits data if no collector is present (ex Radio) - only get latest value
    val hotFlow = MutableSharedFlow<String>()

    launch {
        hotFlow.collect {
            println("First Collector: $it")
        }
    }
    delay(1000)
    hotFlow.emit("First")
    hotFlow.emit("Second")

    launch {
        hotFlow.collect {
            println("Second Collector: $it")
        }
    }

}