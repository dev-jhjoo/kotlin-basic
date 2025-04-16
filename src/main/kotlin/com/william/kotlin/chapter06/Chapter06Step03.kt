package com.william.kotlin.chapter06

fun main() {
    println(square(5))
    println(max(10, 20))
}

fun square(x: Int) = x * x

fun max(a: Int, b: Int) = if (a > b) a else b
