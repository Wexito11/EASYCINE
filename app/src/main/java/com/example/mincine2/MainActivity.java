package com.example.mincine2;



import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    //Variables

    private EditText ed_correo, ed_contraseña;
    private FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auth = FirebaseAuth.getInstance();

        ed_correo = findViewById(R.id.emailEditText);
        ed_contraseña = findViewById(R.id.passwordEditText);

    }
    public void ingresar (View view){

        String correo = ed_correo.getText().toString();
        String contraseña = ed_contraseña.getText().toString();

        auth.signInWithEmailAndPassword(correo, contraseña).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(MainActivity.this, "El ingreso es Exitoso", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Selcategoria.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Ingreso No Exitoso", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void registro (View vista){

        String correo = ed_correo.getText().toString();
        String contraseña = ed_contraseña.getText().toString();

        auth.createUserWithEmailAndPassword(correo, contraseña).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(MainActivity.this, "Registro Fue Exitoso", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Registro No Exitos", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    }
