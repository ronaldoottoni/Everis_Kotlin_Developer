package dev.legasys.bank

class Pessoa {
    var nome: String = "Ronaldo"
    var cpf: String = "123.123.123-12"
}

fun main(){
    val ronaldo = Pessoa()

    println(ronaldo.nome)
    println(ronaldo.cpf)
}