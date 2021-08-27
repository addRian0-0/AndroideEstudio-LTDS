package com.example.calculadora;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Respuesta
        EditText respuestaEdit = findViewById(R.id.respuesta);
        Button btnIgual = findViewById(R.id.igual);

        //Numeros
        Button btn1 = findViewById(R.id.uno);
        Button btn2 = findViewById(R.id.dos);
        Button btn3 = findViewById(R.id.tres);
        Button btn4 = findViewById(R.id.cuatro);
        Button btn5 = findViewById(R.id.cinco);
        Button btn6 = findViewById(R.id.seis);
        Button btn7 = findViewById(R.id.siete);
        Button btn8 = findViewById(R.id.ocho);
        Button btn9 = findViewById(R.id.nueve);
        Button btn0 = findViewById(R.id.cero);

        //Operaciones
        Button btnSuma = findViewById(R.id.suma);


    }

}