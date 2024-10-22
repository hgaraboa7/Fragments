package com.hectorgc.fragments.vista.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.hectorgc.fragments.R;
import com.hectorgc.fragments.modelo.entidades.Pelicula;

import java.util.List;

public class PeliculaAdapter extends ArrayAdapter<Pelicula> {

    private List<Pelicula> peliculas;


    public PeliculaAdapter(Context context, List<Pelicula>peliculas){
        super(context,0,peliculas);
        this.peliculas=peliculas;

    }

    //  aquí inflamos la vista y vinculamos los datos de la película a los componentes de la interfaz.

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Comprobamos si la vista actual (convertView) es nula, en cuyo caso inflamos una nueva vista.



        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.pelicula_element, parent, false);

        }

        Pelicula pelicula=peliculas.get(position);

        // Obtener referencias a los elementos de la vista

      //  TextView nombreTV=convertView.findViewById(R.id.nombre_pelicula);





        return super.getView(position, convertView, parent);
    }
}
