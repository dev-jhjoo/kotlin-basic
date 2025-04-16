package com.william.kotlin.chapter04

fun main() {
    checkType(1)
    checkType(1L)
    checkType(1.0f)
    checkType(1.2)
    checkType("1")
    checkType('1')
    checkType(if(1 > 0) true else false)
}

fun checkType(x: Any) {
    when (x) {
        is Char -> println("Char 입니다: $x")
        is String -> println("String 입니다: $x")
        is Int -> println("Int 입니다: $x")
        is Long -> println("Long 입니다: $x")
        is Float -> println("Float 입니다: $x")
        is Double -> println("Double 입니다: $x")
        is Boolean -> println("Boolean 입니다: $x")
        else -> println("알 수 없는 타입입니다")
    }
}