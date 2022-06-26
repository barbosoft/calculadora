package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultat;
    //private TextView valor;
    Float numero1 = 0.0f;
    Float numero2 = 0.0f;
    String operador = "";
    private Button buttonDecimal;

    private boolean clickSeparadorDecimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultat = findViewById(R.id.txtResultat);
        //valor = findViewById(R.id.txtResultat);

        // Button per els decimals
        buttonDecimal =  findViewById(R.id.btnDecimal);
        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String textAnterior = resultat.getText().toString();

                if (clickSeparadorDecimal == false) {
                    resultat.setText(textAnterior + ".");
                    clickSeparadorDecimal = true;
                    accionsAdicionals (R.id.btnDecimal);
                }
            }
        });


    }

    /**
     *
     * @param idButtonActual
     */
    private void accionsAdicionals (int idButtonActual){

        //Falta realitzar
        /*
        if (idButtonActual != R.id.btnNumMes) {
            clickSigneMes = false;
        }

        if (idButtonActual != R.id.btnNumMenys) {
            clickSigneMenys = false;
        }

        if (idButtonActual != R.id.btnMultiplicar) {
            clickSigneMultiplicar = false;
        }

        if (idButtonActual != R.id.btnDividir) {
            clickSigneDivisio = false;
        }
        */
        if (idButtonActual != R.id.btnDecimal) {
            clickSeparadorDecimal = false;
        }
        //Realment hauria d'anar de la següent manera
        /*
        if (idButtonActual == R.id.btnNumMes
                || idButtonActual == R.id.btnNumMenys
                || idButtonActual == R.id.btnNumMultiplicar
                || idButtonActual == R.id.btnNumDividir) {

                clickSeparadorDecimal = false;

        }
         */



    }

    public void inserirZero(View view) {
        if (resultat.getText().toString().equals("0")) {
            resultat.setText("0");
        }else {
            resultat.setText(resultat.getText() + "0");
        }
    }

    public void inserirU(View view) {
        if (resultat.getText().toString().equals("0")) {
            resultat.setText("1");
        }else {
            resultat.setText(resultat.getText() + "1");
        }
    }

    public void inserirDos(View view) {
        if (resultat.getText().toString().equals("0")) {
            resultat.setText("2");
        }else {
            resultat.setText(resultat.getText() + "2");
        }
    }

    public void inserirTres(View view) {
        if (resultat.getText().toString().equals("0")) {
            resultat.setText("3");
        }else {
            resultat.setText(resultat.getText() + "3");
        }
    }

    public void inserirQuatre(View view) {
        if (resultat.getText().toString().equals("0")) {
            resultat.setText("4");
        }else {
            resultat.setText(resultat.getText() + "4");
        }
    }

    public void inserirCinc(View view) {
        if (resultat.getText().toString().equals("0")) {
            resultat.setText("5");
        }else {
            resultat.setText(resultat.getText() + "5");
        }
    }

    public void inserirSis(View view) {
        if (resultat.getText().toString().equals("0")) {
            resultat.setText("6");
        }else {
            resultat.setText(resultat.getText() + "6");
        }
    }

    public void inserirSet(View view) {
        if (resultat.getText().toString().equals("0")) {
            resultat.setText("7");
        }else {
            resultat.setText(resultat.getText() + "7");
        }
    }

    public void inserirVuit(View view) {
        if (resultat.getText().toString().equals("0")) {
            resultat.setText("8");
        }else {
            resultat.setText(resultat.getText() + "8");
        }
    }

    public void inserirNou(View view) {
        if (resultat.getText().toString().equals("0")) {
            resultat.setText("9");
        }else {
            resultat.setText(resultat.getText() + "9");
        }
    }

    public void dividir(View view) {

        operador = "÷";
        desarNumero1(view);

    }

    public void multiplicar (View view) {

        operador = "X";
        desarNumero1(view);

    }

    public void restar (View view) {

        operador = "-";
        desarNumero1(view);

    }

    public void sumar (View view) {

        operador = "+";
        desarNumero1(view);

    }

    public void netejar(View view) {

        resultat.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operador = "";

    }

    public void desarNumero1(View view) {

        numero1 = Float.parseFloat(resultat.getText().toString());
        resultat.setText("0");

    }

    public void esborrar(View view) {

        String text = resultat.getText().toString(); resultat.setText(text.substring(0, text.length() -1));

        // Un altre opció
        /*
        int length =  resultat.getText().length();
        if (length > 0) {
            resultat.getText().delete(length - 1, length);
        }
        */
    }


    public void resultat(View view) {

        Float resultatFinal = 0.0f;
        numero2 = Float.parseFloat(resultat.getText().toString());

        // sumar
        if (operador == "+") {
            resultatFinal = numero1 + numero2;
        }

        // restar
        if (operador == "-") {
            resultatFinal = numero1 - numero2;
        }

        // dividir
        if (operador == "÷") {
            resultatFinal = numero1 / numero2;
        }

        // multiplicar
        if (operador == "X") {
            resultatFinal = numero1 * numero2;
        }

        resultat.setText(resultatFinal.toString());

    }




}