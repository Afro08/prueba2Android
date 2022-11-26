package com.example.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity2 extends AppCompatActivity {
    private TextInputLayout tilFiltrar;
    private Button btnFiltrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    private void referencias(){
        tilFiltrar = findViewById(R.id.tilFiltrar);
        btnFiltrar = findViewById(R.id.btnFiltrar);
    }
}