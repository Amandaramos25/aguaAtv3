package com.example.aguaatv3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.aguaatv3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding tela = DataBindingUtil.setContentView(this, R.layout.activity_main);
        tela.setLifecycleOwner(this);

        AguaViewModel lk = new ViewModelProvider(this).get(AguaViewModel.class);
        tela.setVm(lk);

        RecyclerView recyclerView = findViewById(R.id.recycleviewCopos);
    }
}