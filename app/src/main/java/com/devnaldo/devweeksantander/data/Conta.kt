package com.devnaldo.devweeksantander.data

data class Conta(
    val numero: String,
    val agencia: String,
    val limite: String,
    val saldo: String,
    val cliente: Cliente,
    val cartao: Cartao,

    ) {
}