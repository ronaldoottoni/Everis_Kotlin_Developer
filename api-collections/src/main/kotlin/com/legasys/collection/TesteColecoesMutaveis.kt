package com.legasys.collection

fun main() {
    val jose = Funcionario("José", 2000.0, "CLT")
    val maria = Funcionario("Maria", 1500.0, "PJ")
    val paulo = Funcionario("Paulo", 4000.0, "CLT")


    //Declarando uma lista/coleção MUTÁVEL (permite menipulação), também permite as açoes estudadas anteriormente
    println("----- LIST -------")
    val funcionarios = mutableListOf(jose, maria)
    funcionarios.forEach {println(it)}

    //Colecoes mutaveis permitem adicionar novos itens na coleção
    println("----- ADD -------")
    funcionarios.add(paulo) //adiciona um novo item na coleção
    funcionarios.forEach {println(it)}

    //Colecoes mutaveis permitem remover  itens na coleção
    println("----- REMOVE -------")
    funcionarios.remove(jose) //remove um item na coleção
    funcionarios.forEach {println(it)}

    println("----- SET -------")
    val funcionarioSet = mutableSetOf(jose)
    //funcionarioSet.forEach {println(it)}

    //SetOf mutavel tambem permite adicionar novo item
    funcionarioSet.add(paulo)
    funcionarioSet.add(maria)
    funcionarioSet.forEach {println(it)}

    //SetOf mutavel tambem permite remover um item
    println("----- SET REMOVE-------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach {println(it)}
}