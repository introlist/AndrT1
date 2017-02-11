package com.example.demon.tarea1;

import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Converter extends AppCompatActivity {
    EditText input;
    RadioGroup rg;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        output = (TextView) findViewById(R.id.textResultado);
        input = (EditText) findViewById(R.id.editText);
        input.setFilters(new InputFilter[]{new FiltroDecimal()});
        rg = (RadioGroup) findViewById(R.id.radiosGrupo);
    }

    public void conversion(View view){
        double resultado;

        int interaccion = rg.getCheckedRadioButtonId();

        RadioButton radioSelect = (RadioButton) findViewById(interaccion);

        if(radioSelect.getText().toString().equals("Celcius")){
            resultado = Double.valueOf(input.getText().toString());
            resultado = ((resultado * 1.8) + 32);
            String outText = String.format("%.2f", resultado);
            outText = outText + " °F";
            output.setText(outText);
        }else
        if(radioSelect.getText().toString().equals("Farenheit")){
            resultado = Double.valueOf(input.getText().toString());
            resultado = ((resultado - 32) / 1.8);

            String outText = String.format("%.2f", resultado);
            outText = outText + " °C";
            output.setText(outText);
        }

    }

    public void limpiar(View view){
        input.setText("");
        output.setText("");
    }

}
