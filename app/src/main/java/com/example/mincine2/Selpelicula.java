package com.example.mincine2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedList;

public class Selpelicula extends AppCompatActivity {

    //Variables
    private RecyclerView recyclerPeliculas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selpelicula);

        recyclerPeliculas = findViewById(R.id.RecyclerPelis);


        LinkedList<peliculas> Peliculas = new LinkedList<peliculas>();

        Peliculas.add(new peliculas("El aro", "Horror", "Gore Verbinsky", R.drawable.imagenaro));
        Peliculas.add(new peliculas("Freddy Krueguer", "Slasher", "Wes Craven",  R.drawable.elfredy));
        Peliculas.add(new peliculas("The Wicker Man", "Folk    ", "Robin Hardy",  R.drawable.elwicker));

        PeliculasAdapter  adapter = new PeliculasAdapter(Peliculas);

        recyclerPeliculas.setLayoutManager(new LinearLayoutManager(this));
        recyclerPeliculas.setAdapter(adapter);
    }


}