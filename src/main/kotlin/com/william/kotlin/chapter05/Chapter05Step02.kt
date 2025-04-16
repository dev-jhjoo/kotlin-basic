package com.william.kotlin.chapter05

fun main() {
    val fruits = listOf("apple", "banana", "orange")

    for ((index, value) in fruits.withIndex()) {
        println("$index: $value")
    }
}