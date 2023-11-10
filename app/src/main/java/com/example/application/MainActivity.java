package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declara variables y enlazar
        Button btn_home = findViewById(R.id.btn_home);

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // VEntana emergente
                Toast.makeText(getApplicationContext(),"¡VAMOS ADELANTE!",Toast.LENGTH_SHORT).show();

                //Creamos intento de ir a otra paguina
                Intent irPag2 = new Intent(MainActivity.this, MainActivity2.class);
                //Iniciamos el intento
                startActivity(irPag2);
            }
        });

    }
}