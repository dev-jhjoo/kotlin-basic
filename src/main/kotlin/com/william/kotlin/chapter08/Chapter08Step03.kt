package com.william.kotlin.chapter08

fun main() {
    val numbers = setOf(1, 2, 2, 3)
    println(numbers)          // [1, 2, 3]

    val mutableSet = mutableSetOf(1, 2)
    mutableSet.add(3)
    mutableSet.remove(1)
    println(mutableSet)       // [2, 3]
}