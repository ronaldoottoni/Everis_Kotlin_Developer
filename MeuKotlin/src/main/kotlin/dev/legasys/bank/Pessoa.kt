package dev.legasys.bank

class Pessoa {
    var nome: String = "Ronaldo"

    var cpf: String = "123.123.123-12"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main(){
    val ronaldo = Pessoa()

    /*
    println(ronaldo)
    println(ronaldo.nome)
    println(ronaldo.cpf)
    */

    println(ronaldo.pessoaInfo())

}