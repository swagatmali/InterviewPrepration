package com.swagatmali.interviewprepration.coroutines

//Main routine
fun main() {
    first() // Subroutine
    second() // Subroutine
}

fun first() {
    var first = 10
    while (true) {
        println("First ${first++}")
    }
}

fun second() {
    var second = 0
    while (true) {
        println("First ${second++}")
    }
}