package com.brunomaion.noticiaaplicativo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainNoticia2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_noticia2);

    }

    public void tela3(View view){
        Intent intent = new Intent(this, MainNoticia3.class);
        startActivity(intent);
    }

    public void tela1(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}