package com.example.elfrarep.sistemadeprotocolosunifacisa;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    //Ação dos botões
    public void cadastro (View v){
        setContentView(R.layout.cadastro);
    }

    public void acompanharProtocolo (View v){
        setContentView(R.layout.acompanhar_protocolo);
    }

    public void pesquisarProtocolo (View v){
        setContentView(R.layout.pesquisar_protocolo);
    }

    public void solicitarProtocolo (View v){
        setContentView(R.layout.solicitar_protocolo);
    }

    public void voltar (View v){
        setContentView(R.layout.activity_main);
    }

    public void fechar (View v){
        finish();
    }

    public void enviarFormulario(View view){
        FrameLayout fl = (FrameLayout) findViewById(R.id.fl);
        fl.setVisibility(View.VISIBLE);
    }


}

