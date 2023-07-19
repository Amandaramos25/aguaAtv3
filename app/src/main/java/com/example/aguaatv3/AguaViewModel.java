package com.example.aguaatv3;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AguaViewModel extends ViewModel {

    private MutableLiveData<String> Peso;

    public MutableLiveData<String> getPesoValor() {
        if(Peso==null){
            Peso = new MutableLiveData<String>("0");
        }
        return Peso;
    }

    public void Calcular(){

    }
}
