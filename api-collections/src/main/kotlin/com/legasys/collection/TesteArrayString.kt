package com.legasys.collection

fun main() {
    //Esta forma de declaração exige a identificação do tipo do Array e o tamanho (forma verbosa)
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Zazá"
    nomes[2] = "José"

    for (nome in nomes){
        println(nome)
    }
    println("*---------*")
    nomes.sort()
    nomes.forEach { println(it) }

    println("*---------*")

    //Forma menos verbosa de declarar  o array e utilizando o arrayOf e já inferindo o tipo na inicialização,
    // não precisando informar o tipo
    val nomes2 = arrayOf("Maria", "Zazá", "Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }
}