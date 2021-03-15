package com.legasys.collection

fun main() {
    val joao  = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    //Create é uma função dentro do repositorio que simula um banco de dados,
    //adicionando novos registros a coleção
    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(pedro.nome, pedro)

    //FINDBYID é uma função dentro do repositorio que retorna os dados de um registro
    //utilizando o ID Nome como chave.
    println("----- FINDBYID-------")
    println(repositorio.findById(maria.nome))

    //Imprime todos os elementos na coleção
    println("----- FINDALL-------")
    repositorio.findAll().forEach { println(it) }

    //REmove itens da colecao
    println("----- REMOVE -------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}