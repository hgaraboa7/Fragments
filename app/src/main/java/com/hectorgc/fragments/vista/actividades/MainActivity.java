package com.hectorgc.fragments.vista.actividades;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.hectorgc.fragments.R;
import com.hectorgc.fragments.modelo.entidades.Pelicula;
import com.hectorgc.fragments.vista.fragmentos.DatosPelicula;
import com.hectorgc.fragments.vista.fragmentos.ListaPeliculas;

public class MainActivity extends AppCompatActivity implements ListaPeliculas.OnPeliculaSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public void onPeliculaSelected(Pelicula pelicula) {
         /* error sin acabar
       boolean esTablet=(getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK)



               if(esTablet){

                   DatosPelicula datosPeliculaFragment=DatosPelicula.newInstance(
                           pelicula.getNombre(),
                           pelicula.getSinopsis(),
                           pelicula.getFecha().toString(),
                           pelicula.getGenero(),
                           null
                   );
                   }


               }*/




    }
}