package com.devnaldo.devweeksantander.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.devnaldo.devweeksantander.R
import com.devnaldo.devweeksantander.data.Conta

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
       buscarCliente()
    }
      private fun buscarCliente(){
          mainViewModel.buscarContaCliente().observe(this, Observer { result ->
              binView(result)
          })
      }

      private fun binView(conta: Conta){
           findViewById<TextView>(R.id.tv_agencia).text = (conta.agencia)
           findViewById<TextView>(R.id.tv_cc).text = (conta.numero)
           findViewById<TextView>(R.id.tv_usuario).text = (conta.cliente.nome)
           findViewById<TextView>(R.id.tv_saldoR).text = (conta.saldo)
           findViewById<TextView>(R.id.tv_saldo_mais_mais).text = (conta.limite)
           findViewById<TextView>(R.id.final_text_number).text = (conta.cartao.numeroDaConta)
       }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.item_01 -> {
                Log.d("CLICK", "Click no item ")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }

}