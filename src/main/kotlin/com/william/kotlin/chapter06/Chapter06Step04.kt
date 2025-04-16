package com.william.kotlin.chapter06


fun main() {
    greet()                // Guest로 출력
    greet("William")   // William으로 출력
}

private fun greet(name: String = "Guest") {
    println("안녕하세요, $name 님!")
}
