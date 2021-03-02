package dev.legasys.bank.testes

import dev.legasys.bank.Banco

fun main(){
    val  legaSysBank = Banco(nome = "LegaSys Bank", numero = 13)

    println(legaSysBank.nome)
    println(legaSysBank.numero)

    val banco2 = legaSysBank.copy(nome = "LegaSys Poup", numero = 13)

    println(banco2.info())
}