package com.example.user.qualomelhorlcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText vAlcool;
    private EditText vGasolina;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vAlcool = findViewById(R.id.alcool);
        vGasolina = findViewById(R.id.gasolina);
        result = findViewById(R.id.result);


    }

    public void calcularPreco(View View){
        //recuperando valores
        String precoAlcool = vAlcool.getText().toString();
        String precoGasolina = vGasolina.getText();toString();

        //validação
        boolean validacao = validacao(precoAlcool,precoGasolina);
        if(validacao){

        }else{
            result.setText("Preencha os campos primeiro");
        }
    }
    public boolean validacao(String pAlcool, String pGasolina){
         boolean campos = true;

         if(pAlcool == null || pAlcool == equals("")){
             campos = false;
         }else if(pGasolina == null || pGasolina == equals("")){
             campos = false;
         }
         return campos;
    }
}
