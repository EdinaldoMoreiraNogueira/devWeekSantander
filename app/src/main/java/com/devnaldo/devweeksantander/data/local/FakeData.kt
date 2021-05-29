package com.devnaldo.devweeksantander.data.local

import com.devnaldo.devweeksantander.data.Cartao
import com.devnaldo.devweeksantander.data.Cliente
import com.devnaldo.devweeksantander.data.Conta

class FakeData{

    fun getlocalData() : Conta {

        val cliente = Cliente("Edinaldo")
        val cartao = Cartao(" 2254")
        return Conta( "25486-4",
                            "254-5",
                             "R$ 2.548,76",
                              "R$ 25.548,76",
                             cliente,
                             cartao
        );
    }
}
