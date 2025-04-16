package com.william.kotlin.chapter04

fun main() {
    val score = 75

    val grade =
        if (score >= 90) "A"
        else if (score >= 80) "B"
        else "C"

    println("당신의 등급은 $grade")
}