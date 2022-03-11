package com.example.tablas1_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button siguiente;
    TextView tablas;
    Spinner calcula;
    String resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        siguiente=findViewById(R.id.btnseguiente);
        tablas=findViewById(R.id.txtTablas);
        calcula=findViewById(R.id.sptablas);
        String selecciona[]={"Seleccione tabla","Calcula tabla del 1","Calucla tabla del 2","Calcula tabla del 3","Calcula tabla del 4","Calcula tabla del 5","Calcula tabla del 6","Calcula tabla del 7","Calcula tabla del 8","Calcula tabla del 9","Calcula tabla del 10"};
        ArrayAdapter adaptadorcalcula = new ArrayAdapter(this, android.R.layout.simple_spinner_item,selecciona);
        calcula.setAdapter(adaptadorcalcula);

       siguiente.setOnClickListener(new View.OnClickListener() {
    @Override
     public void onClick(View view) {
        Intent intent =new Intent(getApplicationContext(),MainActivity3.class);
        startActivity(intent);
     }
      });
calcula.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        switch (adapterView.getSelectedItemPosition()){
            case 0:
                tablas.setText("");
                break;
            case 1:
                resultado = "";
                for(int j = 1; j<= 10; j++){
                    resultado += (1 + " X " + j + " = " + 1*j +  '\n');
                }
                tablas.setText(resultado.toString());
                break;
            case 2:
                resultado = "";
                for(int j = 1; j<= 10; j++){
                    resultado += (2 + " X " + j + " = " + 2*j +  '\n');
                }
                tablas.setText(resultado.toString());
                break;
            case 3:
                resultado = "";
                for(int j = 1; j<= 10; j++){
                    resultado += (3 + " X " + j + " = " + 3*j +  '\n');
                }
                tablas.setText(resultado.toString());
                break;
                case 4:
                    resultado = "";
                    for(int j = 1; j<= 10; j++){
                        resultado += (4 + " X " + j + " = " + 4*j +  '\n');
                    }
                    tablas.setText(resultado.toString());
                break;
            case 5:
                resultado = "";
                for(int j = 1; j<= 10; j++){
                    resultado += (5 + " X " + j + " = " + 5*j +  '\n');
                }
                tablas.setText(resultado.toString());
                break;
            case 6:
                resultado = "";
                for(int j = 1; j<= 10; j++){
                    resultado += (6 + " X " + j + " = " + 6*j +  '\n');
                }
                tablas.setText(resultado.toString());
                break;
            case 7:
                resultado = "";
                for(int j = 1; j<= 10; j++){
                    resultado += (7 + " X " + j + " = " + 7*j +  '\n');
                }
                tablas.setText(resultado.toString());
                break;
            case 8:
                resultado = "";
                for(int j = 1; j<= 10; j++){
                    resultado += (8 + " X " + j + " = " + 8*j +  '\n');
                }
                tablas.setText(resultado.toString());
                break;
            case 9:
                resultado = "";
                for(int j = 1; j<= 10; j++){
                    resultado += (9 + " X " + j + " = " + 9*j +  '\n');
                }
                tablas.setText(resultado.toString());
                break;
            case 10:
                resultado = "";
                for(int j = 1; j<= 10; j++){
                    resultado += (10 + " X " + j + " = " + 10*j +  '\n');
                }
                tablas.setText(resultado.toString());
                break;


        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
});

    }
}