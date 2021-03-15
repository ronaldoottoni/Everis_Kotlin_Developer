package com.legasys.collection

fun main() {
    //Atribuição da coleção utilizando PAIR
    val pair: Pair<String, Double> = Pair("Joao", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k = Valor: $v") }

    println("-----------")
    //Atribuição da coleção Utilizando sintaxe INFIX
    val map2 = mapOf(
        "Maria" to 2500.0,
        "José" to 3000.0
    )

    map2.forEach{ (k, v) -> println("Chave: $k = Valor: $v") }
}