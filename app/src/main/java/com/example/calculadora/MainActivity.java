package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultat;
    //private TextView valor;
    Float numero1 = 0.0f;
    Float numero2 = 0.0f;
    String operador = "";
    // Buttons
    private Button buttonNumero0;
    private Button buttonNumero1;
    private Button buttonNumero2;
    private Button buttonNumero3;
    private Button buttonNumero4;
    private Button buttonNumero5;
    private Button buttonNumero6;
    private Button buttonNumero7;
    private Button buttonNumero8;
    private Button buttonNumero9;
    private Button buttonNetejar;
    private Button buttonSumar;
    private Button buttonRestar;
    private Button buttonDividir;
    private Button buttonMultiplicar;
    private Button buttonDecimal;
    private Button buttonSigne;
    private Button buttonEsborrar;

    // Condicionals booleans
    private boolean clickSumar, clickRestar, clickMultiplicar, clickDividir, clickSeparadorDecimal, clickSigne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultat = findViewById(R.id.txtResultat);
        resultat.setFocusable(true);
        resultat.setFocusableInTouchMode(true);
        resultat.setInputType(InputType.TYPE_NULL);

        // Button per els números
        buttonNumero0 = findViewById(R.id.btn0);
        buttonNumero0.setOnClickListener(view -> {

            String resultatAnterior = resultat.getText().toString();
            resultat.setText(resultatAnterior + "0");
            accionsAdicionals (R.id.btn0);

        });

        buttonNumero1 = findViewById(R.id.btn1);
        buttonNumero1.setOnClickListener(view -> {

            String resultatAnterior = resultat.getText().toString();
            resultat.setText(resultatAnterior + "1");
            accionsAdicionals (R.id.btn1);

        });

        buttonNumero2 = findViewById(R.id.btn2);
        buttonNumero2.setOnClickListener(view -> {

            String resultatAnterior = resultat.getText().toString();
            resultat.setText(resultatAnterior + "2");
            accionsAdicionals (R.id.btn2);

        });

        buttonNumero3 = findViewById(R.id.btn3);
        buttonNumero3.setOnClickListener(view -> {

            String resultatAnterior = resultat.getText().toString();
            resultat.setText(resultatAnterior + "3");
            accionsAdicionals (R.id.btn3);

        });

        buttonNumero4 = findViewById(R.id.btn4);
        buttonNumero4.setOnClickListener(view -> {

            String resultatAnterior = resultat.getText().toString();
            resultat.setText(resultatAnterior + "4");
            accionsAdicionals (R.id.btn4);

        });

        buttonNumero5 = findViewById(R.id.btn5);
        buttonNumero5.setOnClickListener(view -> {

            String resultatAnterior = resultat.getText().toString();
            resultat.setText(resultatAnterior + "5");
            accionsAdicionals (R.id.btn5);

        });

        buttonNumero6 = findViewById(R.id.btn6);
        buttonNumero6.setOnClickListener(view -> {

            String resultatAnterior = resultat.getText().toString();
            resultat.setText(resultatAnterior + "6");
            accionsAdicionals (R.id.btn6);

        });

        buttonNumero7 = findViewById(R.id.btn7);
        buttonNumero7.setOnClickListener(view -> {

            String resultatAnterior = resultat.getText().toString();
            resultat.setText(resultatAnterior + "7");
            accionsAdicionals (R.id.btn7);

        });

        buttonNumero8 = findViewById(R.id.btn8);
        buttonNumero8.setOnClickListener(view -> {

            String resultatAnterior = resultat.getText().toString();
            resultat.setText(resultatAnterior + "8");
            accionsAdicionals (R.id.btn8);

        });

        buttonNumero9 = findViewById(R.id.btn9);
        buttonNumero9.setOnClickListener(view -> {

            String resultatAnterior = resultat.getText().toString();
            resultat.setText(resultatAnterior + "9");
            accionsAdicionals (R.id.btn9);

        });

        // Buttons Sumar, restar, Dividir i Multiplicar
        buttonSumar = findViewById(R.id.btnSumar);
        buttonSumar.setOnClickListener((view -> {
            String resultatAnterior = resultat.getText().toString();
            // Si abans hi havia algun valor concatenem
            if (resultatAnterior.trim().length() > 0 && clickSumar == false) {
                resultat.setText(resultatAnterior + "+");
                clickSumar = true;
                accionsAdicionals (R.id.btnSumar);
            }

        }));

        buttonRestar = findViewById(R.id.btnRestar);
        buttonRestar.setOnClickListener((view -> {
            String resultatAnterior = resultat.getText().toString();
            // Si abans hi havia algun valor concatenem
            if (resultatAnterior.trim().length() > 0 && clickRestar == false) {
                resultat.setText(resultatAnterior + "-");
                clickRestar = true;
                accionsAdicionals (R.id.btnRestar);
            }

        }));

        buttonDividir = findViewById(R.id.btnDividir);
        buttonDividir.setOnClickListener((view -> {
            String resultatAnterior = resultat.getText().toString();
            // Si abans hi havia algun valor concatenem
            if (resultatAnterior.trim().length() > 0 && clickDividir == false) {
                resultat.setText(resultatAnterior + "÷");
                clickDividir = true;
                accionsAdicionals (R.id.btnDividir);
            }

        }));

        buttonMultiplicar = findViewById(R.id.btnMultiplicar);
        buttonMultiplicar.setOnClickListener((view -> {
            String resultatAnterior = resultat.getText().toString();
            // Si abans hi havia algun valor concatenem
            if (resultatAnterior.trim().length() > 0 && clickMultiplicar == false) {
                resultat.setText(resultatAnterior + "x");
                clickMultiplicar = true;
                accionsAdicionals (R.id.btnMultiplicar);
            }

        }));

        // Button Netejar C
        buttonNetejar = findViewById(R.id.btnNetejar);
        buttonNetejar.setOnClickListener(view -> {
            resultat.setText("");
            accionsAdicionals (R.id.btnNetejar);
        });

        // Button Esborrar <--
        buttonEsborrar = findViewById(R.id.btnEsborrar);
        buttonEsborrar.setOnClickListener(view -> {
            String text = resultat.getText().toString();
            resultat.setText(text.substring(0, text.length() -1));
            accionsAdicionals (R.id.btnEsborrar);
        });


        // Button per els decimals
        buttonDecimal = findViewById(R.id.btnDecimal);
        buttonDecimal.setOnClickListener(view -> {

            String resultatAnterior = resultat.getText().toString();

            if (clickSeparadorDecimal == false) {
                resultat.setText(resultatAnterior + ".");
                clickSeparadorDecimal = true;
                accionsAdicionals (R.id.btnDecimal);
            }
        });

        buttonSigne = findViewById(R.id.btnSigne);
        buttonSigne.setOnClickListener(view -> {
            String resultatAnterior = resultat.getText().toString();
            if (clickSigne == false) {
                resultat.setText("-" + resultatAnterior);
                clickSigne = true;
                accionsAdicionals (R.id.btnSigne);

            } else if (resultat.getText().toString().equals("-")) {
                //String text = resultat.getText().toString();
                resultat.setText(resultatAnterior.substring(0, resultatAnterior.length() -1));
                resultat.setText(resultatAnterior);
                clickSigne = true;
                accionsAdicionals (R.id.btnSigne);
            }


            //accionsAdicionals (R.id.btnSigne);

        });


    }

    /**
     *
     * @param idButtonActual
     */
    private void accionsAdicionals (int idButtonActual){

        //Falta realitzar

        if (idButtonActual != R.id.btnSumar) {
            clickSumar = false;
        }

        if (idButtonActual != R.id.btnRestar) {
            clickRestar = false;
        }

        if (idButtonActual != R.id.btnMultiplicar) {
            clickMultiplicar = false;
        }

        if (idButtonActual != R.id.btnDividir) {
            clickDividir = false;
        }

        if (idButtonActual != R.id.btnSigne) {
            clickSigne = false;
        }

        if (idButtonActual == R.id.btnSumar
                || idButtonActual == R.id.btnRestar
                || idButtonActual == R.id.btnMultiplicar
                || idButtonActual == R.id.btnDividir) {

                clickSeparadorDecimal = false;
        }




    }
/*
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

    }
*/
/*
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
*/



}