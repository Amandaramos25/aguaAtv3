package com.example.aguaatv3;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AguaViewModel extends ViewModel {

    private MutableLiveData<String> Peso;
    private MutableLiveData<String> AguaFaltando;

    public MutableLiveData<String> getPesoValor() {
        if(Peso==null){
            Peso = new MutableLiveData<String>("0");
        }
        return Peso;
    }



    public void Calcular(){
        int pesoInt = Integer.parseInt(Peso.getValue());
        
    }
}
