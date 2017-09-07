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

    public Vista vista;
    public Controlador controlador;

    public Vista getVista(){
        return this.vista;
    }

    public void setVista(Vista vista){
        this.vista = vista;
    }

    public Controlador getControlador(){
        return this.controlador;
    }

    public void setControlador(Controlador controlador){
        this.controlador = controlador;
    }


    public MyListener (Vista vista, Controlador controlador){
        this.vista = vista;
        this.controlador = controlador;
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.botonC) {
            vista.MostrarTexto("");
        }

        if (v.getId() == R.id.boton1) {

            vista.MostrarTexto("1");
        }

        if (v.getId() == R.id.boton2) {

            vista.MostrarTexto("2");
        }

        if (v.getId() == R.id.boton3) {

            vista.MostrarTexto("3");
        }

        if (v.getId() == R.id.boton4) {

            vista.MostrarTexto("4");
        }

        if (v.getId() == R.id.boton5) {

            vista.MostrarTexto("5");
        }

        if (v.getId() == R.id.boton6) {

            vista.MostrarTexto("6");
        }

        if (v.getId() == R.id.boton7) {

            vista.MostrarTexto("7");
        }

        if (v.getId() == R.id.boton8) {

            vista.MostrarTexto("8");
        }

        if (v.getId() == R.id.boton9) {

            vista.MostrarTexto("9");
        }

        if (v.getId() == R.id.boton0) {

            vista.MostrarTexto("0");
        }

        if (v.getId() == R.id.botonDecimal) {

            vista.MostrarTexto(".");
        }

        if (v.getId() == R.id.botonSumar) {

            controlador.Operacion("+");
        }

        if (v.getId() == R.id.botonRestar) {

            controlador.Operacion("-");
        }

        if (v.getId() == R.id.botonMultiplicar) {

            controlador.Operacion("*");
        }

        if (v.getId() == R.id.botonDividir) {

            controlador.Operacion("/");
        }

        if (v.getId() == R.id.botonIgual) {

            controlador.ObtenerResultado();
        }
    }
}
