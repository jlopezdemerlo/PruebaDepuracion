package com.example.jlopezm.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button btnBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //un error tipico es utilizar un control de otra Actividad
        btnBoton=(Button)findViewById(R.id.btnMainActivity);
        //nos saldrá un error en esta línea
        btnBoton.setText("Boton Prueba Error");
    }
}
