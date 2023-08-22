package com.martintecno.milista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.martintecno.milista.Modelo.Persona;
import com.martintecno.milista.databinding.ActivityMainBinding;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private MainActivityViewModel vmMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());//
        setContentView(binding.getRoot());

        vmMain = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);

        vmMain.getlistaPersonasM().observe(this, new Observer<List<Persona>>() {
            @Override
            public void onChanged(List<Persona> personas) {

                PersonaAdapter PA = new PersonaAdapter(MainActivity.this,binding.LVListaPersonas.getId(),personas,getLayoutInflater());

                binding.LVListaPersonas.setAdapter(PA);
            }
        });

        vmMain.cargarDatos();

    }
}