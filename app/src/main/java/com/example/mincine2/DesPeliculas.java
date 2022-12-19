package com.example.mincine2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DesPeliculas extends AppCompatActivity {

    private ImageView imagenpeliculaInfo;

    private TextView textnombrepeli, textcategory, textdirector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_des_peliculas);

        imagenpeliculaInfo = findViewById(R.id.Imagenpeliinfo);

        textnombrepeli = findViewById(R.id.textnombrepeli);
        textcategory = findViewById(R.id.textcategory);
        textdirector = findViewById(R.id.textdirector);


        imagenpeliculaInfo.setImageResource(getIntent().getIntExtra("idImagen", 0));

        textnombrepeli.setText(getIntent().getStringExtra("nombre"));
        textcategory.setText(getIntent().getStringExtra("categoria"));
        textdirector.setText(getIntent().getStringExtra("director"));
          }

    public void AntSelPelicula(View v)
    {
        Intent inte8 = new Intent(this,Selpelicula.class);
        startActivity(inte8);
    }
}