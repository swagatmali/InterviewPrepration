package com.swagatmali.interviewprepration.coroutines

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {

    val job =
        launch(start = CoroutineStart.LAZY) { // will use Lazy when we want to srat execution manually
            repeat(3) {
                println("Coroutine is running $it")
                delay(500)
            }
        }

    job.start() //Start will release the thread to work and then the job done "Coroutine is running" will execute
//    job.join() //Join will wait for the job to complete and then only it will proceed further
//    job.cancel() //Cancel will cancel the job
    job.invokeOnCompletion { //invokeOnCompletion will execute when the job is completed
        println("Job is completed")
    }
    job.isActive //Check if the job is active
    job.isCompleted //Check if the job is completed
    job.isCancelled //Check if the job is cancelled
    println("End")
}