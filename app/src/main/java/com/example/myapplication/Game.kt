package com.example.myapplication

import kotlin.random.Random

object Game {

    private val rules = mapOf(
        "ROCK-SCISSOR" to true,
        "ROCK-PAPPER" to false,
        "SCISSOR-ROCK" to false,
        "SCISSOR-PAPPER" to true,
        "PAPPER-ROCK" to true,
        "PAPPER-SCISSOR" to false,
    )

    private val drawableOptions = mapOf(
        "ROCK" to R.drawable.stone,
        "SCISSOR" to R.drawable.scissor,
        "PAPPER" to R.drawable.papper,
    )

//    The !! operator﻿
//
//    The third option is for NPE-lovers: the not-null assertion operator (!!) converts any value to a non-null type and throws an exception if the value is null. You can write b!!, and this will return a non-null value of b (for example, a String in our example) or throw an NPE if b is null:
//
//    val l = b!!.length
//
//    Thus, if you want an NPE, you can have it, but you have to ask for it explicitly and it won't appear out of the blue.

    private  val options = listOf("ROCK", "SCISSOR", "PAPPER")

    fun pickRandomOption(): String = options[Random.nextInt(0, 3)]

    fun pickDrawable(option: String): Int = drawableOptions[option]!!

    fun isDraw(from: String, to: String): Boolean = from == to

    fun isWin(from: String, to: String): Boolean = rules["$from-$to"]!!

//    fun isLose(from: String, to: String): Boolean {rules["$from-$to"]!!}


}