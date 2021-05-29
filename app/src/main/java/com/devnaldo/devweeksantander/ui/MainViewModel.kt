package com.devnaldo.devweeksantander.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.devnaldo.devweeksantander.data.Conta
import com.devnaldo.devweeksantander.data.local.FakeData

class MainViewModel : ViewModel() {

    private val mutableLiveData : MutableLiveData<Conta> =  MutableLiveData()

    fun buscarContaCliente() : LiveData<Conta>{

        mutableLiveData.value = FakeData().getlocalData()

        return mutableLiveData
    }
}