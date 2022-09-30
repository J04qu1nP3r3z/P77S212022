package com.example.p77s212022;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ObjetoActivity extends AppCompatActivity {
    TextView lblNombreo, lblEdado;
    Button btnRegresao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objeto);

        btnRegresao = findViewById(R.id.btnRegresao);
        lblNombreo = findViewById(R.id.lblNombreo);
        lblEdado = findViewById(R.id.lblEdado);

        Datos datos = getIntent().getParcelableExtra("Datosp");
        String nombre ="";
        int edad = 0;

        Bundle parametros = getIntent().getExtras();
        nombre = datos.getNombre();
        edad = datos.getEdad();


        lblNombreo.setText(nombre);
        lblEdado.setText(String.valueOf(edad));

        btnRegresao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}