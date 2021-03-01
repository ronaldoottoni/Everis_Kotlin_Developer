package dev.legasys.bank

class Pessoa {
    var nome: String = "Ronaldo"

    var cpf: String = "123.123.123-12"
    private set

}

fun main(){
    val ronaldo = Pessoa()

    ronaldo.cpf = "159.157.154-35"

    println(ronaldo.nome)
    println(ronaldo.cpf)

}