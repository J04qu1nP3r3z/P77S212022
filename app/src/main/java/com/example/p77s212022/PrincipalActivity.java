package com.example.p77s212022;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PrincipalActivity extends AppCompatActivity {

    Handler manejador = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(PrincipalActivity.this,MenuActivity.class);
                startActivity(intent);
                finish();
            }
        },5000);
    }
}