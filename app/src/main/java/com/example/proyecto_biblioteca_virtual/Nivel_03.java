package com.example.proyecto_biblioteca_virtual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Nivel_03 extends AppCompatActivity {
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel_03);

        tv1 = (TextView) findViewById(R.id.tv1);
        String nivel = getIntent().getStringExtra("nivel");
        String materia = getIntent().getStringExtra("Materia");
        tv1.setText(nivel+ "->" + materia);
    }
}
