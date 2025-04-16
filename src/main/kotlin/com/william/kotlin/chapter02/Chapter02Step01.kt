package com.william.kotlin.chapter02

fun main() {
    val age: Int = 30
    val salary: Long = 3_000_000L
    val pi: Double = 3.14159
    val isAdult: Boolean = true
    val firstLetter: Char = 'K'
    val language: String = "Kotlin"
    val degree: Float = 14.4f

    println("나이: $age")
    println("연봉: $salary")
    println("원주율: $pi")
    println("성인인가요? $isAdult")
    println("첫 글자: $firstLetter")
    println("언어 이름: $language")
    println("기온: $degree")

    val a = 32
    println("a=" + (a + 8))
    val b = "32"
    println("b=" + (b + 8))

    val flag:Boolean = false
    println("flag.not? ${flag.not()}")
}