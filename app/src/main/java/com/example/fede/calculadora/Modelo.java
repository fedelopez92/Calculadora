package com.example.fede.calculadora;

/**
 * Created by Fede on 07/09/2017.
 */

public class Modelo {

    private String operador;
    private String numero1;
    private String numero2;
    private Float resultado;

    public String getOperador(){
        return this.operador;
    }

    public void setOperador(String operador){
        this.operador = operador;
    }

    public String getNumero1() {
        return this.numero1;
    }

    public void setNumero1(String numero1) {
        this.numero1 = numero1;
    }

    public String getNumero2() {
        return this.numero2;
    }

    public void setNumero2(String numero2) {
        this.numero2 = numero2;
    }

    public Float getResultado() {
        return this.resultado;
    }

    public void setResultado(Float resultado) {
        this.resultado = resultado;
    }
}
