package com.example.fede.calculadora;

import android.view.View;

/**
 * Created by Fede on 07/09/2017.
 */

public class Controlador {

    private Vista vista;
    private Modelo modelo;


    public Vista getVista() {
        return this.vista;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }

    public Modelo getModelo() {
        return this.modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }


    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }


    public void Operacion(String operador){

        if(vista.editText.getText().toString() != "") {
            modelo.setNumero1(vista.editText.getText().toString());
            modelo.setOperador(operador);
            vista.editText.setText("");
        }
    }

    public void ObtenerResultado(){

        if(vista.editText.getText().toString() != "" && modelo.getOperador() != "") {

            modelo.setNumero2(vista.editText.getText().toString());

            if(modelo.getOperador().equals("+")){
                modelo.setResultado(Float.parseFloat(modelo.getNumero1()) + Float.parseFloat(modelo.getNumero2()));
            }
            if(modelo.getOperador().equals("-")){
                modelo.setResultado(Float.parseFloat(modelo.getNumero1()) - Float.parseFloat(modelo.getNumero2()));
            }
            if(modelo.getOperador().equals("*")){
                modelo.setResultado(Float.parseFloat(modelo.getNumero1()) * Float.parseFloat(modelo.getNumero2()));
            }
            if(modelo.getOperador().equals("/")){
                modelo.setResultado(Float.parseFloat(modelo.getNumero1()) / Float.parseFloat(modelo.getNumero2()));
            }

            vista.editText.setText(modelo.getResultado().toString());
        }
    }
}
