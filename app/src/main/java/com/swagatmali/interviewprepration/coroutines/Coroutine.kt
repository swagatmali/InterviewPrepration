package com.swagatmali.interviewprepration.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//Main routine
fun main() {
    first() // Subroutine
    second() // Subroutine
}

// Stack
//Main -> First
// Here program flow is blocked by First as it will never end. We have to make first as non blocking.

fun first() {
    var first = 10
    while (true) {
        println("First ${first++}")
    }
}

fun second() {
    var second = 0
    while (true) {
        println("Second ${second++}")
    }
}

//Solution

//Main routine
//fun main(): Unit = runBlocking {
//    launch {
//        first1() // Coroutine
//    }
//    launch {
//        second1() // Coroutine
//    }
//}
//
//suspend fun first1() {
//    var first = 10
//    while (true) {
//        println("First ${first++}")
//        delay(100)
//    }
//}
//
//suspend fun second1() {
//    var second = 0
//    while (true) {
//        println("Second ${second++}")
//        delay(100)
//    }
//}
