package com.example.fede.calculadora;

import android.util.Log;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Fede on 30/08/2017.
 */

public class MyListener implements View.OnClickListener {

    public EditText editText;
    public String operacion="0";


    public MyListener (EditText editText){
        this.editText = editText;
    }

    @Override
    public void onClick(View v) {

            if (v.getId() == R.id.boton1) {
                editText.setText("1");
                operacion.concat("1");
            }

            if (v.getId() == R.id.boton2) {
                editText.setText("2");
                operacion.concat("2");
            }

            if (v.getId() == R.id.boton3) {
                editText.setText("3");
                operacion.concat("3");
            }

            if (v.getId() == R.id.boton4) {
                editText.setText("4");
                operacion.concat("4");
            }

            if (v.getId() == R.id.boton5) {
                editText.setText("5");
                operacion.concat("5");
            }

            if (v.getId() == R.id.boton6) {
                editText.setText("6");
                operacion.concat("6");
            }

            if (v.getId() == R.id.boton7) {
                editText.setText("7");
                operacion.concat("7");
            }

            if (v.getId() == R.id.boton8) {
                editText.setText("8");
                operacion.concat("8");
            }

            if (v.getId() == R.id.boton9) {
                editText.setText("9");
                operacion.concat("9");
            }

            if (v.getId() == R.id.boton0) {
                editText.setText("0");
                operacion.concat("0");
            }

            if (v.getId() == R.id.botonSumar) {
                operacion.concat("+");
            }

            if (v.getId() == R.id.botonSumar) {
                operacion.concat("-");
            }

            if (v.getId() == R.id.botonMultiplicar) {
                operacion.concat("*");
            }

            if (v.getId() == R.id.botonDividir) {
                operacion.concat("/");
            }
        }
}
