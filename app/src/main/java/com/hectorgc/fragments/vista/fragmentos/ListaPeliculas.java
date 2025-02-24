package com.hectorgc.fragments.vista.fragmentos;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.hectorgc.fragments.R;
import com.hectorgc.fragments.modelo.entidades.Pelicula;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link vistaPeliculas#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListaPeliculas extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private OnPeliculaSelectedListener listener;


    public interface OnPeliculaSelectedListener{
        void onPeliculaSelected(Pelicula pelicula);
    }




    public ListaPeliculas() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment vistaPeliculas.
     */
    // TODO: Rename and change types and number of parameters
    public static ListaPeliculas newInstance(String param1, String param2) {
        ListaPeliculas fragment = new ListaPeliculas();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_vista_peliculas, container, false);
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof OnPeliculaSelectedListener){
            listener=(OnPeliculaSelectedListener)context;
        }else{
            throw new ClassCastException(context.toString()+" debe implementar onpeliculas... ");
        }


    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        Pelicula pelicula=(Pelicula) parent.getItemAtPosition(position);
        listener.onPeliculaSelected(pelicula);
    }



}