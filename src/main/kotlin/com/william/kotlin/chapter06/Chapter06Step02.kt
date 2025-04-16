package com.william.kotlin.chapter06

fun main() {
    greet("William")
    val result = add(1, 2)
    println("1 + 2 = $result")
}

private fun greet(name: String) {
    println("Hello, $name!")
}

fun add(a: Int, b: Int): Int {
    return a + b
}
