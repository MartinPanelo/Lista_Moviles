package com.martintecno.milista;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.martintecno.milista.Modelo.Persona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    private Context context;
    private List<Persona> listaPersonas;
    private MutableLiveData<List<Persona>> listaPersonasM;
    public MainActivityViewModel(@NonNull Application application) {
        super(application);

        context = application.getApplicationContext();
        listaPersonas = new ArrayList<Persona>();
    }

    public LiveData<List<Persona>> getlistaPersonasM(){

        if(listaPersonasM == null){
            listaPersonasM = new MutableLiveData<>();
        }
        return listaPersonasM;
    }



    public void cargarDatos(){
        listaPersonas.add(new Persona(123,"Martin","Panelo"));
        listaPersonas.add(new Persona(123,"Rodrigo","Moran"));
        listaPersonas.add(new Persona(123,"john","wick"));
        listaPersonas.add(new Persona(124, "Laura", "González"));
        listaPersonas.add(new Persona(125, "Carlos", "Pérez"));
        listaPersonas.add(new Persona(126, "Ana", "López"));
        listaPersonas.add(new Persona(127, "Juan", "Rodríguez"));
        listaPersonas.add(new Persona(128, "María", "Martínez"));
        listaPersonas.add(new Persona(129, "Luis", "Díaz"));
        listaPersonas.add(new Persona(130, "Sofía", "Hernández"));
        listaPersonas.add(new Persona(131, "Diego", "Gómez"));
        listaPersonas.add(new Persona(132, "Valentina", "Torres"));
        listaPersonas.add(new Persona(133, "Miguel", "Fernández"));

        listaPersonasM.setValue(listaPersonas);
    }




}
