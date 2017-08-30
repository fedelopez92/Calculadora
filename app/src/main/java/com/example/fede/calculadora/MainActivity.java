package com.example.fede.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListener myListener = new MyListener();

        Button btn1 = (Button) super.findViewById(R.id.boton1);
        btn1.setOnClickListener(myListener);

        Button btn2 = (Button) super.findViewById(R.id.boton2);
        btn2.setOnClickListener(myListener);

        Button btn3 = (Button) super.findViewById(R.id.boton3);
        btn3.setOnClickListener(myListener);

        Button btn4 = (Button) super.findViewById(R.id.boton4);
        btn4.setOnClickListener(myListener);

        Button btn5 = (Button) super.findViewById(R.id.boton5);
        btn5.setOnClickListener(myListener);

        Button btn6 = (Button) super.findViewById(R.id.boton6);
        btn6.setOnClickListener(myListener);

        Button btn7 = (Button) super.findViewById(R.id.boton7);
        btn7.setOnClickListener(myListener);

        Button btn8 = (Button) super.findViewById(R.id.boton8);
        btn8.setOnClickListener(myListener);

        Button btn9 = (Button) super.findViewById(R.id.boton9);
        btn9.setOnClickListener(myListener);

        Button btn0 = (Button) super.findViewById(R.id.boton0);
        btn0.setOnClickListener(myListener);
    }
}
