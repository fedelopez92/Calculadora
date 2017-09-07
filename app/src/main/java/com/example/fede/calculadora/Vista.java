package com.example.fede.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Fede on 07/09/2017.
 */

public class Vista extends AppCompatActivity{

    public EditText editText;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn0;
    public Button btnSumar;
    public Button btnRestar;
    public Button btnMultiplicar;
    public Button btnDividir;
    public Button btnIgual;
    public Button btnC;
    public Button btnDecimal;


    public Vista(){

        this.editText = (EditText) super.findViewById(R.id.editText);
        this.btn1 = (Button) super.findViewById(R.id.boton1);
        this.btn2 = (Button) super.findViewById(R.id.boton2);
        this.btn3 = (Button) super.findViewById(R.id.boton3);
        this.btn4 = (Button) super.findViewById(R.id.boton4);
        this.btn5 = (Button) super.findViewById(R.id.boton5);
        this.btn6 = (Button) super.findViewById(R.id.boton6);
        this.btn7 = (Button) super.findViewById(R.id.boton7);
        this.btn8 = (Button) super.findViewById(R.id.boton8);
        this.btn9 = (Button) super.findViewById(R.id.boton9);
        this.btn0 = (Button) super.findViewById(R.id.boton0);
        this.btnSumar = (Button) super.findViewById(R.id.botonSumar);
        this.btnRestar = (Button) super.findViewById(R.id.botonRestar);
        this.btnMultiplicar = (Button) super.findViewById(R.id.botonMultiplicar);
        this.btnDividir = (Button) super.findViewById(R.id.botonDividir);
        this.btnIgual = (Button) super.findViewById(R.id.botonIgual);
        this.btnC = (Button) super.findViewById(R.id.botonC);
        this.btnDecimal = (Button) super.findViewById(R.id.botonDecimal);
    }

    public void SetearListener(View.OnClickListener myListener){

        btn1.setOnClickListener(myListener);
        btn2.setOnClickListener(myListener);
        btn3.setOnClickListener(myListener);
        btn4.setOnClickListener(myListener);
        btn5.setOnClickListener(myListener);
        btn6.setOnClickListener(myListener);
        btn7.setOnClickListener(myListener);
        btn8.setOnClickListener(myListener);
        btn9.setOnClickListener(myListener);
        btn0.setOnClickListener(myListener);
        btnSumar.setOnClickListener(myListener);
        btnRestar.setOnClickListener(myListener);
        btnMultiplicar.setOnClickListener(myListener);
        btnDividir.setOnClickListener(myListener);
        btnIgual.setOnClickListener(myListener);
        btnC.setOnClickListener(myListener);
        btnDecimal.setOnClickListener(myListener);
    }

    public void MostrarTexto(String texto){

        if(texto.equals("")){
            editText.setText(texto);
        }
        else{
            editText.setText(editText.getText().toString() + texto);
        }
    }
}
