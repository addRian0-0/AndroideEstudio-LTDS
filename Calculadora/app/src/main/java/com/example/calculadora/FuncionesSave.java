package com.example.calculadora;

import android.content.Context;

import java.io.File;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class FuncionesSave {

    private File archivo = new File("historial.txt");
    ArrayList<Operaciones> listaOperacion = new ArrayList<>();

    /*

        try{

            BufferedReader fin = new BufferedReader(new InputStreamReader(openFileInput("historial.txt")));
            String texto  = fin.readLine();
            System.out.println(texto);
            fin.close();

        }catch(Exception e){
            System.out.println("ERROR LECTURA" + e.getMessage());
        }



            try{

                OutputStreamWriter escribir = new OutputStreamWriter(openFileOutput("historial.txt", Context.MODE_PRIVATE));
                escribir.write( Float.toString(n.getNum1()) + " " + operacion + " " + Float.toString(n.getNum2()) + " = " + Float.toString(res));
                escribir.close();

            }catch(Exception e){
                System.out.println("ERROR sout "  + e.getMessage());
            }

    * */

}
