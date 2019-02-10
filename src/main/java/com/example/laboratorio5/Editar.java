package com.example.laboratorio5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class Editar extends AppCompatActivity {

    ArrayList<String> listN;
    ArrayList<String> listT;
    ArrayList<String> listC;
    EditText editText;
    EditText editText1;
    EditText editText2;




    Button b1;
    Button b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);

        editText = (EditText) findViewById(R.id.nombre);
        editText1 = (EditText) findViewById(R.id.Telefono1);
        editText2 = (EditText) findViewById(R.id.correo1);

        b1 = (Button)findViewById(R.id.crear);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nom=editText.getText().toString();
                listN.add(nom);

                String tel=editText1.getText().toString();
                listT.add(tel);

                String cor=editText1.getText().toString();
                listC.add(cor);

                Intent in1 = new Intent(Editar.this, MainActivity.class);
                startActivity(in1);
            }
        });

        b2 = (Button)findViewById(R.id.regresar);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 = new Intent(Editar.this, MainActivity.class);
                startActivity(in2);
            }
        });

        Intent i = new Intent(Editar.this, MainActivity.class);
        i.putExtra("key", listC);
        startActivity(i);

    }
}
