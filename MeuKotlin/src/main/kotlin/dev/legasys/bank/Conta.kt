package dev.legasys.bank

import java.math.BigDecimal

class Conta(
    val agencia: String,
    val numero: String,
    val saldo: BigDecimal
) {
    fun deposito(valor: BigDecimal){

    }

    fun saque(valor: BigDecimal){

    }
}