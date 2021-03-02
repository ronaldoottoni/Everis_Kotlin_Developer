package dev.legasys.bank.testes

import dev.legasys.bank.Funcionario
import dev.legasys.bank.Pessoa
import java.math.BigDecimal

fun main() {
    val ronaldo = Pessoa(nome = "Ronaldo Ottoni", cpf = "123.123.123-23")
    println(ronaldo.nome)
    println(ronaldo.cpf)

    val joao = Funcionario(nome = "Joao Cantor", cpf = "123456789-25", salario = BigDecimal(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}