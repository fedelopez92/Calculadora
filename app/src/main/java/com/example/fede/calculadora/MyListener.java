package com.example.fede.calculadora;

import android.view.View;

/**
 * Created by Fede on 30/08/2017.
 */

public class MyListener implements View.OnClickListener {

    public String texto;

    public MyListener (String texto){
        this.texto = texto;
    }

    @Override
    public void onClick(View v) {

    }
}
