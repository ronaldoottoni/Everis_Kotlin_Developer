package dev.legasys.bank.testes

import dev.legasys.bank.Gerente


fun main() {
    val maria = Gerente(nome = "Maria das Dores", cpf = "98765432132", salario = 5000.0, senha = "senha123")

    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)

}