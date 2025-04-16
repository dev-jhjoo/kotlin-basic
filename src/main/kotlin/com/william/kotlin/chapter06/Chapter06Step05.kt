package com.william.kotlin.chapter06

fun main() {
    printAll("하이", "헬로", "안녕")
    printAll("잘가")
}

private fun printAll(vararg messages: String) {
    for (msg in messages) println(msg)
}