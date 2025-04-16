package com.william.kotlin.chapter04

fun main() {
    val score = 85

    if (score >= 90) {
        println("A 등급")
    } else if (score >= 80) {
        println("B 등급")
    } else {
        println("C 등급 이하")
    }
}