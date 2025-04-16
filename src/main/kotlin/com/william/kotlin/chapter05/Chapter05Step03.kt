package com.william.kotlin.chapter05

fun main() {
    for (i in 1..5) {
        println("i는 $i")
    }

    for (i in 1 until 5) {  // 5는 포함하지 않음
        println("i는 $i")
    }

    for (i in 10 downTo 1 step 2) {
        println("2씩 감소: $i")
    }
}