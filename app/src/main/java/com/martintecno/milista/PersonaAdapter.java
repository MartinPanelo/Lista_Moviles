package com.martintecno.milista;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.martintecno.milista.Modelo.Persona;

import java.util.List;

public class PersonaAdapter extends ArrayAdapter<Persona> {

    private Context context;
    private List<Persona> listadoPersonas;
    private LayoutInflater infladorDeLista;
    public PersonaAdapter(@NonNull Context context, int resource, List<Persona> listadoPersonas, LayoutInflater infladorDeLista  ) {
        super(context, resource, listadoPersonas);
        this.context = context;
        this.listadoPersonas = listadoPersonas;
        this.infladorDeLista = infladorDeLista;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View itemView=convertView;

        if(itemView == null){
            itemView = infladorDeLista.inflate(R.layout.item_lista,parent, false);
        }

        Persona persona = listadoPersonas.get(position);

        TextView dni = itemView.findViewById(R.id.TVDni);
        TextView nombre = itemView.findViewById(R.id.TVNmobre);
        TextView apellido = itemView.findViewById(R.id.TVApellido);

        dni.setText(persona.getDni()+"");
        nombre.setText(persona.getNombre());
        apellido.setText(persona.getApellido());


        return itemView;
    }

    @Override
    public int getCount() {
        return listadoPersonas.size();
    }
}
