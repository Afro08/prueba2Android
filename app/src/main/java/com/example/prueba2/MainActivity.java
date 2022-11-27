package com.example.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button btnBuscar,btnIngresar,btnModificar;
    private TextInputLayout tilTitulo,tilDescripcion;
    public ArrayList<Tarea> listaTarea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        referencias();
        eventos();


    }
    private void segundaActividad(){
        Intent segundaActividad = new Intent(this,MainActivity2.class);
        startActivity(segundaActividad);


    }
    //region referencias y eventos
    private void referencias(){
        btnBuscar = findViewById(R.id.btnBuscar);
        btnIngresar = findViewById(R.id.btnIngresar);
        btnModificar = findViewById(R.id.btnModificar);
        tilTitulo = findViewById(R.id.tilTitulo);
        tilDescripcion = findViewById(R.id.tilDescripcion);
        listaTarea = new ArrayList<Tarea>();
    }
    private void eventos(){
        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                segundaActividad();
            }
        }
        )
        ;
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviarDatos();
            }
        });}

    //endregion
        private void enviarDatos(){
            Intent sendDatos = new Intent(this,MainActivity2.class);
            String titulo = tilTitulo.getEditText().getText().toString();
            String descripcion = tilDescripcion.getEditText().getText().toString();
            sendDatos.putExtra("sendTitulo",titulo);
            sendDatos.putExtra("sendDescripcion",descripcion);
            startActivity(sendDatos);
        }


}