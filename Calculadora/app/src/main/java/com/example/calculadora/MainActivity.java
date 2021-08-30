package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Numeros n = new Numeros();

    //Respuesta
    private TextView respuestaEdit;
    private float num1 = 0;
    private float num2 = 0;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        respuestaEdit = findViewById(R.id.respuesta);
    }

    public void dividir(View view){
        n.setNum1(Float.parseFloat(respuestaEdit.getText().toString()));
        operacion = "/";
        respuestaEdit.setText("0");
    }

    public void igual(View view){
        float res;
        n.setNum2(Float.parseFloat(respuestaEdit.getText().toString()));
        switch (operacion){

            case "+":
                res = n.getNum1() + n.getNum2();
                respuestaEdit.setText(Float.toString(res));
                break;

            case "/":
                if(n.getNum2() == 0 || n.getNum1() == 0){
                    Toast.makeText(this, "No se puede dividir entre 0", Toast.LENGTH_LONG).show();
                }else{
                    res = n.getNum1() / n.getNum2();
                    respuestaEdit.setText(Float.toString(res));
                }
                break;

            case "-":
                res = n.getNum1() - n.getNum2();
                respuestaEdit.setText(Float.toString(res));
                break;

            case "*":
                res = n.getNum1() * n.getNum2();
                respuestaEdit.setText(Float.toString(res));
                break;

            case "%":
                if(n.getNum2() == 0){
                    Toast.makeText(this, "No se puede sacar modulo de cero", Toast.LENGTH_LONG).show();
                }else{
                    res = n.getNum1() % n.getNum2();
                    respuestaEdit.setText(Float.toString(res));
                }
                break;

            case "pot":
                if(n.getNum2() <= 0){
                    Toast.makeText(this, "No se permiten potencias negativas", Toast.LENGTH_LONG).show();
                }else{
                    try{
                        double resp = Math.pow(n.getNum1(), n.getNum2());
                        respuestaEdit.setText(Double.toString(resp));
                    }catch(Exception e ){
                        Toast.makeText(this, "Ocurrio un error" + e.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }
                break;

        }
    }

    public void borrar(View view){
        String ops = respuestaEdit.getText().toString();
        ops = ops.substring(0, ops.length()-1);
        respuestaEdit.setText(ops);
    }

    public void potencia(View view){
        n.setNum1(Float.parseFloat(respuestaEdit.getText().toString()));
        operacion = "pot";
        respuestaEdit.setText("0");
    }

    public void raiz(View view){
        if(Float.parseFloat(respuestaEdit.getText().toString()) <= 0){
            Toast.makeText(this, "Solo se puede sacar raiz cuadrarda a numero mayores a 0", Toast.LENGTH_LONG).show();
        }else{
            try{
                double res = Math.sqrt(Float.parseFloat(respuestaEdit.getText().toString()));
                respuestaEdit.setText(Double.toString(res));
            }catch (Exception e){
                Toast.makeText(this, "Ocurrio un error..." + e.getMessage(), Toast.LENGTH_LONG).show();
                respuestaEdit.setText("0");
            }
        }
    }

    public void modulo(View view){
        n.setNum1(Float.parseFloat(respuestaEdit.getText().toString()));
        operacion = "%";
        respuestaEdit.setText("0");
    }

    public void multiplicar(View view){
        n.setNum1(Float.parseFloat(respuestaEdit.getText().toString()));
        operacion = "*";
        respuestaEdit.setText("0");
    }

    public void suma(View view){
        n.setNum1(Float.parseFloat(respuestaEdit.getText().toString()));
        operacion = "+";
        respuestaEdit.setText("0");
    }

    public void resta(View view){
        n.setNum1(Float.parseFloat(respuestaEdit.getText().toString()));
        operacion = "-";
        respuestaEdit.setText("0");
    }

    public void puntito(View view){
        respuestaEdit.setText(respuestaEdit.getText() + ".");
    }

    public void clear(View view){
        respuestaEdit.setText("0");
        num1 = 0.0f;
        num2 = 0.0f;
        n.setNum1(0.0f);
        n.setNum2(0.0f);
        operacion = "";
    }

    public void siete(View view){
        if(respuestaEdit.getText().length() > 0){num1 = Float.parseFloat(respuestaEdit.getText().toString());}
        if(num1 == 0.0f ){respuestaEdit.setText("7");}else{respuestaEdit.setText(respuestaEdit.getText() + "7");}
    }

    public void ocho(View view) {
        if(respuestaEdit.getText().length() > 0){num1 = Float.parseFloat(respuestaEdit.getText().toString());}
        if(num1 == 0.0f ){respuestaEdit.setText("8");}else{respuestaEdit.setText(respuestaEdit.getText() + "8");}
    }

    public void nueve(View view) {
        if(respuestaEdit.getText().length() > 0){num1 = Float.parseFloat(respuestaEdit.getText().toString());}
        if(num1 == 0.0f ){respuestaEdit.setText("9");}else{respuestaEdit.setText(respuestaEdit.getText() + "9");}
    }

    public void cuatro(View view) {
        if(respuestaEdit.getText().length() > 0){num1 = Float.parseFloat(respuestaEdit.getText().toString());}
        if(num1 == 0.0f ){respuestaEdit.setText("4");}else{respuestaEdit.setText(respuestaEdit.getText() + "4");}
    }

    public void cinco(View view) {
        if(respuestaEdit.getText().length() > 0){num1 = Float.parseFloat(respuestaEdit.getText().toString());}
        if(num1 == 0.0f ){respuestaEdit.setText("5");}else{respuestaEdit.setText(respuestaEdit.getText() + "5");}
    }

    public void seis(View view) {
        if(respuestaEdit.getText().length() > 0){num1 = Float.parseFloat(respuestaEdit.getText().toString());}
        if(num1 == 0.0f ){respuestaEdit.setText("6");}else{respuestaEdit.setText(respuestaEdit.getText() + "6");}
    }

    public void uno(View view) {
        if(respuestaEdit.getText().length() > 0){num1 = Float.parseFloat(respuestaEdit.getText().toString());}
        if(num1 == 0.0f ){respuestaEdit.setText("1");}else{respuestaEdit.setText(respuestaEdit.getText() + "1");}
    }

    public void dos(View view) {
        if(respuestaEdit.getText().length() > 0){num1 = Float.parseFloat(respuestaEdit.getText().toString());}
        if(num1 == 0.0f ){respuestaEdit.setText("2");}else{respuestaEdit.setText(respuestaEdit.getText() + "2");}
    }

    public void tres(View view) {
        if(respuestaEdit.getText().length() > 0){num1 = Float.parseFloat(respuestaEdit.getText().toString());}
        if(num1 == 0 ){respuestaEdit.setText("3");}else{respuestaEdit.setText(respuestaEdit.getText() + "3");}
    }

    public void cero(View view) {
        if(respuestaEdit.getText().length() > 0){num1 = Float.parseFloat(respuestaEdit.getText().toString());}
        if(num1 == 0.0f ){respuestaEdit.setText("0");}else{respuestaEdit.setText(respuestaEdit.getText() + "0");}
    }

}