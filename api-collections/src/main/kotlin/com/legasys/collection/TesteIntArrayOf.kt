package com.legasys.collection

fun main() {
    //intArrayOf permite uma quantidade ilimitada de elementos, não engessando a variável
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    values.forEach {
        println(it)
    }

    println("*----------*")

    values.sort()
    values.forEach {
        println(it)
    }
}