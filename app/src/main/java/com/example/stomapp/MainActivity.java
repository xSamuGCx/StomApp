package com.example.stomapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonContacta = findViewById(R.id.boton_contacta);
        botonContacta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent (v.getContext(),boton_contacta.class);
                startActivity(intent);
            }
        });

        Button botonRecetas = findViewById(R.id.boton_recetas);
        botonRecetas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent (v.getContext(),boton_recetas.class);
                startActivity(intent);
            }
        });

        Button botonMapa = findViewById(R.id.boton_mapa);
        botonMapa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent (v.getContext(),boton_mapa.class);
                startActivity(intent);
            }
        });
    }
}