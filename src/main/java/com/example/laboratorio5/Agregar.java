package com.example.laboratorio5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Agregar extends AppCompatActivity {


    ArrayList<String> Alist;
    EditText editText;



    Button b1;
    Button b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);

        editText = (EditText) findViewById(R.id.nombre);

        b1 = (Button)findViewById(R.id.crear);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nom=editText.getText().toString();
                Alist.add(nom);

                Intent in1 = new Intent(Agregar.this, MainActivity.class);
                startActivity(in1);
            }
        });

        b2 = (Button)findViewById(R.id.regresar);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 = new Intent(Agregar.this, MainActivity.class);
                startActivity(in2);
            }
        });

        Intent i = new Intent(Agregar.this, MainActivity.class);
        i.putExtra("key", Alist);
        startActivity(i);

    }
}
