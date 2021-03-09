package com.legasys.collection

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 5500.1
    salarios[1] = 3000.0
    salarios[2] = 500.0

    //expressao lambda para imprimir todos os elementos
    salarios.forEach { println(it) }

    println("*-----------*")
    //Forma lambda de percorrer todos os elementos do array aplicando uma função comum a todos
    salarios.forEachIndexed{ index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println("*-----------*")

    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
}