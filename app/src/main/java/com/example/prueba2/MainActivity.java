package com.example.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    private Button btnBuscar,btnIngresar,btnModificar;
    private TextInputLayout tilTitulo,tilDescripcion;

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
    }
    private void eventos(){
        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                segundaActividad();
            }
        });
    }
    //endregion

}