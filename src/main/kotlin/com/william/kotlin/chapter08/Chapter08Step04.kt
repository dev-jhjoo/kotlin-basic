package com.william.kotlin.chapter08

fun main() {
    val items = listOf("A", "B", "C")
    for (item in items) {
        println("Item: $item")
    }

    val map = mapOf("name" to "William", "job" to "Software engineer")
    for ((key, value) in map) {
        println("$key: $value")
    }
}