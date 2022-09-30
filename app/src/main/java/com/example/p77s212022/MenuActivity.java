package com.example.p77s212022;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    Button btnNat, btnObjs;
    TextView lblNombre, lblEdad;
    EditText txtnombre, txtedad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        String Nombre = "Joaquin Perez";
        int Edad = 37;

        btnNat = findViewById(R.id.btnNat);
        btnObjs = findViewById(R.id.btnObjs);

        btnNat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inativo = new Intent(MenuActivity.this, NativoActivity.class);
                inativo.putExtra("Nombre",Nombre);
                inativo.putExtra("Edad",Edad);
                startActivity(inativo);
            }
        });

        btnObjs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Datos datost = new Datos(Nombre,Edad);
                Datos datos = new Datos();
                datos.setNombre(Nombre);
                datos.setEdad(Edad);

                Intent iobj = new Intent(MenuActivity.this, ObjetoActivity.class);
                iobj.putExtra("Datosp",datos);
                startActivity(iobj);
            }
        });

    }
}