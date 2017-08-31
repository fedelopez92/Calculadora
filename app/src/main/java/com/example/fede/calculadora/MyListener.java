package com.example.fede.calculadora;

import android.icu.text.CompactDecimalFormat;
import android.icu.text.DecimalFormat;
import android.icu.text.NumberFormat;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Fede on 30/08/2017.
 */

public class MyListener implements View.OnClickListener {

    public EditText editText;
    public String numero1;
    public String numero2;
    public String operador="";
    public Float resultado;


    public MyListener (EditText editText){
        this.editText = editText;
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.botonC) {
            editText.setText("");
        }

        if (v.getId() == R.id.boton1) {

            editText.setText(editText.getText().toString() + "1");
        }

        if (v.getId() == R.id.boton2) {

            editText.setText(editText.getText().toString() + "2");
        }

        if (v.getId() == R.id.boton3) {

            editText.setText(editText.getText().toString() + "3");
        }

        if (v.getId() == R.id.boton4) {

            editText.setText(editText.getText().toString() + "4");
        }

        if (v.getId() == R.id.boton5) {

            editText.setText(editText.getText().toString() + "5");
        }

        if (v.getId() == R.id.boton6) {

            editText.setText(editText.getText().toString() + "6");
        }

        if (v.getId() == R.id.boton7) {

            editText.setText(editText.getText().toString() + "7");
        }

        if (v.getId() == R.id.boton8) {

            editText.setText(editText.getText().toString() + "8");
        }

        if (v.getId() == R.id.boton9) {

            editText.setText(editText.getText().toString() + "9");
        }

        if (v.getId() == R.id.boton0) {

            editText.setText(editText.getText().toString() + "0");
        }

        if (v.getId() == R.id.botonDecimal) {

            editText.setText(editText.getText().toString() + ".");
        }

        if (v.getId() == R.id.botonSumar) {

            if(editText.getText().toString() != "") {
                numero1 = editText.getText().toString();
                operador = "+";
                editText.setText("");
            }
        }

        if (v.getId() == R.id.botonRestar) {

            if(editText.getText().toString() != "") {
                numero1 = editText.getText().toString();
                operador = "-";
                editText.setText("");
            }
        }

        if (v.getId() == R.id.botonMultiplicar) {

            if(editText.getText().toString() != "") {
                numero1 = editText.getText().toString();
                operador = "*";
                editText.setText("");
            }
        }

        if (v.getId() == R.id.botonDividir) {

            if(editText.getText().toString() != "") {
                numero1 = editText.getText().toString();
                operador = "/";
                editText.setText("");
            }
        }

        if (v.getId() == R.id.botonIgual) {

            if(editText.getText().toString() != "" && operador != "") {

                numero2 = editText.getText().toString();

                if(operador == "+"){
                    resultado = Float.parseFloat(numero1) + Float.parseFloat(numero2);
                }
                if(operador == "-"){
                    resultado = Float.parseFloat(numero1) - Float.parseFloat(numero2);
                }
                if(operador == "*"){
                    resultado = Float.parseFloat(numero1) * Float.parseFloat(numero2);
                }
                if(operador == "/"){
                    resultado = Float.parseFloat(numero1) / Float.parseFloat(numero2);
                }

                editText.setText(resultado.toString());
            }
        }
    }
}
