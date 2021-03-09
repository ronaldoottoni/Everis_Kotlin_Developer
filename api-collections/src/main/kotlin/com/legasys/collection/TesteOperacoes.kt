package com.legasys.collection

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios){
        println(salario)
    }

    println("*----------------------*")

    println("Maior Salario.: ${salarios.max()}")
    println("Menor Salario.: ${salarios.min()}")
    println("Media Salarial: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }

    println("*------ filter > 2500 ---------*")

    salariosMaiorQue2500.forEach { println(it)}

    println("*------ 2000 <count> 5000 ---------*")
    println(salarios.count { it in 2000.0..5000.0 })

    println("*------ <find> ---------*")
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })

    println("*------ <any> ---------*")
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 500.0 })
}