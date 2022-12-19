package com.example.mincine2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Selcategoria extends AppCompatActivity {

    //Variables
    private ListView lista;
    private ArrayList<String> nombrescate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selcategoria);


        //Enlazar
        lista = findViewById(R.id.lista1);


        nombrescate = new ArrayList<String>();
        nombrescate.add("HORROR");
        nombrescate.add("SLASHER");
        nombrescate.add("FOLK HORROR");



        //
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, nombrescate);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(Selcategoria.this, "Has pulsado" + nombrescate.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void SigPeliculas(View view) {

        {
            Intent inte4 = new Intent(this,Selpelicula.class);
            startActivity(inte4);
        }
    }
}