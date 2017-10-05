package com.example.jlopezm.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private final static String LOGTAG ="AplicacionDespuracion";
    String saludo="hola";
    ArrayList <String> lista;
    Button btnBotonNuevaActivity;
    TextView tvPruebaCambioDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvPruebaCambioDatos=(TextView)findViewById(R.id.tvPruebaCambioDatos);

        cargarDatos();
        //tiene que fallar porque no hemos iniciado el boton
        //btnBotonNuevaActivity=(Button)findViewById(R.id.btnMainActivity);
        btnBotonNuevaActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
    }

    /**
     * Este método nos permitirá detectar un error mediante el depurador
     */
    private void cargarDatos() {
        //El programa fallará porque la lista no está inicializada
        for (int i = 1; i <= 10; i++) {
            lista.add("Elemento " + i);
        }
    }

    /**
     * Este método nos permitirá observar los mensajes del Log
      */
    private void cargarDatos2(){
        //El programa fallará porque la lista no está inicializada
        Log.d(LOGTAG,"Entrando en cargardatos2");

        try{
            Log.d(LOGTAG,"Antes de entrar en el for");
            for (int i=1; i<=10; i++){
                lista.add("Elemento "+i);
            }
            Log.d(LOGTAG,"Despues de salir del for");
        }catch (Exception e){
            Log.e(LOGTAG,e.getMessage());
        }
        Log.i(LOGTAG,"Lectura de datos terminada");


    }
}
