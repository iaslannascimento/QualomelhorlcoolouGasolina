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
    //método chamado pelo botão
    public void calcularPreco(View View){
        //recuperando valores
        String precoAlcool = vAlcool.getText().toString();
        String precoGasolina = vGasolina.getText().toString();

        //validação
        boolean validacao = validacao(precoAlcool,precoGasolina);
        if(validacao){
            this.calcularMelhorPreco(precoAlcool,precoGasolina);
        }else{
            result.setText("Preencha os campos primeiro");
        }
    }


    //método para calcular o melhor preço entre gasolina e alcool
    public void calcularMelhorPreco(String precoAlcool, String precoGasolina){
        //converção de valores
        Double pAlcool = Double.parseDouble(precoAlcool);
        Double pGasolina = Double.parseDouble(precoGasolina);
        //calculo utilizado melhor(alcool/gasolina se o resultado for maior que 0.7 é melhor usar gasolina se não alcool
        double x;
        x=(pAlcool/pGasolina);
        if(x >= 0.7){
            result.setText("É melhor usar Gasolina");
        }else {
            result.setText("É melhor usar Álcool");
        }

    }

    //método de validação
    public boolean validacao(String pAlcool, String pGasolina){
         boolean campos = true;

         if(pAlcool == null || pAlcool.equals("")){
             campos = false;
         }else if(pGasolina == null || pGasolina.equals("")){
             campos = false;
         }
         return campos;
    }
}
