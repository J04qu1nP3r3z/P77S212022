package com.example.p77s212022;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NativoActivity extends AppCompatActivity {

    TextView lblNombre, lblEdad;
    Button btnRegresa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nativo);

        lblNombre = findViewById(R.id.lblNombre);
        lblEdad = findViewById(R.id.lblEdad);
        btnRegresa = findViewById(R.id.btnRegresa);

        String nombre ="";
        int edad = 0;

        Bundle parametros = getIntent().getExtras();

        nombre =parametros.getString( "Nombre");
        edad = parametros.getInt("Edad");

        lblNombre.setText(nombre);
        lblEdad.setText(String.valueOf(edad));

        btnRegresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}