package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txt1);
        et2 =  (EditText) findViewById(R.id.txt2);

        tv1 = (TextView) findViewById(R.id.txt_resultado);
    }

    public  void Sumar(View v) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);

        int suma = numero1 + numero2;

        String resultado = String.valueOf(suma);
        tv1.setText(resultado);


    }

    public void Resta(View v) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);

        int resta = numero1 - numero2;

        String resultado = String.valueOf(resta);
        tv1.setText(resultado);

    }

    public void Multiplicion(View v) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);

        int multiplicacion = numero1 * numero2;

        String resultado = String.valueOf(multiplicacion);
        tv1.setText(resultado);

    }

    public void Divicion(View v) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);

        int divicion = numero1 / numero2;

        String resultado = String.valueOf(divicion);
        tv1.setText(resultado);

    }
}
