package com.brunomaion.noticiaaplicativo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainNoticia3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_noticia3);
    }
    public void tela2(View view){
        Intent intent = new Intent(this, MainNoticia2.class);
        startActivity(intent);
    }



    public void tela1(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}