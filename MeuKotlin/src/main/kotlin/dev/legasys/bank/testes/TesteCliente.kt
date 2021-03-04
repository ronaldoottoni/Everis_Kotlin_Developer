package dev.legasys.bank.testes

import dev.legasys.bank.Cliente
import dev.legasys.bank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "José da Silva",
        cpf = "123.123.123.77",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}
