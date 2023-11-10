package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Declaracion de variables
        //Editext
        EditText tx1 = findViewById(R.id.dir);
        EditText tx2 = findViewById(R.id.nom);
        EditText tx3 = findViewById(R.id.Phone);
        EditText tx4 = findViewById(R.id.Email);

        //Checkbox
        CheckBox cb1 = findViewById(R.id.check1);
        CheckBox cb2 = findViewById(R.id.check2);
        CheckBox cb3 = findViewById(R.id.check3);

        //Radiogroup

        RadioButton rb1 = findViewById(R.id.Bt1);
        RadioButton rb2 = findViewById(R.id.Bt2);
        RadioButton rb3 = findViewById(R.id.Bt3);
        //Button

        Button btn = findViewById(R.id.BtEnviar);

        //vamos a poner a escuchar el boton

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Vamos a crear un mensaje con la información digitada por el user
                String msj = "Nombre: " + tx2.getText().toString() +
                        "\nDirección: " + tx1.getText().toString() +
                        "\nTeléfono: " + tx3.getText().toString() +
                        "\nCorreo: " + tx4.getText().toString();

                //Vamos a mostrarlo
                Toast.makeText(getApplicationContext(),msj,Toast.LENGTH_SHORT).show();

            }
        });


    }
}