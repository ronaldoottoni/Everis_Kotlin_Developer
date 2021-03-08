package com.legasys.collection

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 8
    values[3] = 3
    values[4] = 2

    //Impressao utilizando forma convencional , praticamente igual em quase todas as linguagens
    for (valor in values.indices){
        println(values[valor])
    }
    println("----------")
    //Ou uma forma reduzida com recursos do Kotlin
    for (valor in values){
        println(valor)
    }
    println("----------")
    //Imprissao utilizando expressaoo lambda, a propria ide fornece uma variavel de iteraçao "it"
    values.forEach {
        println(it)
    }
    println("----------")
    // OU você pode declarar sua propria variavel
    values.forEach { valor ->
        println(valor)
    }
    //Todas as formas acima devolvem o mesmo resultado

    println("----------**")
    values.sort() //Iteracao para ordenar os valores do array (crescente)
    for (valor in values){
        println(valor)
    }
}