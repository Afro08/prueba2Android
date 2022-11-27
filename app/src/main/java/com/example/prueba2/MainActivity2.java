package com.example.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    private TextInputLayout tilFiltrar;
    private Button btnFiltrar;
    private ArrayAdapter<Tarea> adaptadorTareas;
    private ArrayList<Tarea> tareaLista;
    private ListView lvTarea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        referencias();
        obtenerDatos();
        eventos();
        adaptadorTareas = new ArrayAdapter<Tarea>(this,android.R.layout.simple_list_item_1,tareaLista);
        lvTarea.setAdapter(adaptadorTareas);



        }

    private void referencias(){
        tilFiltrar = findViewById(R.id.tilFiltrar);
        btnFiltrar = findViewById(R.id.btnFiltrar);
        tareaLista = new ArrayList<Tarea>();
        lvTarea = findViewById(R.id.lvTarea);

    }
    private void eventos(){
        btnFiltrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tarea listaTarea = (Tarea)getIntent().getSerializableExtra("sendTarea");
            }
        });
    }
    private void obtenerDatos(){
        int min = 1;
        int max = 10;
        Random random = new Random();
        int random = Math.floor(Math.random()*(max-min+1)+min);
        String recibirTitulo = getIntent().getExtras().getString("sendTitulo");
        String recibirdescripcion = getIntent().getExtras().getString("sendDescripcion");
        Tarea t = new Tarea(
        t.setTitulo(recibirTitulo);
        t.setDescripcion(recibirdescripcion);
        tareaLista.add(t);


    }
}