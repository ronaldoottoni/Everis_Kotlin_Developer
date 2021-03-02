package dev.legasys.bank.testes

import dev.legasys.bank.Analista

fun main() {
    val joao = Analista(nome = "Joao Cantor", cpf = "123456789-25", salario = 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)

}
