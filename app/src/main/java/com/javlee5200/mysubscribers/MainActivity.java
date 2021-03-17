package com.javlee5200.mysubscribers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.javlee5200.mysubscribers.Suscriptores.Menu_Suscriptores;
import com.javlee5200.mysubscribers.Suscriptores.Registro_Suscriptores;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    //Métodos Interfaz Grafica

    //Método cambio de Activity
    public void Login_Suscriptores(View view)
    {
        Intent i = new Intent(this, Menu_Suscriptores.class);
        startActivity(i);
    }


    //Método cambio de Activity
    public void Registro_Suscriptores(View view)
    {
        Intent i = new Intent(this, Registro_Suscriptores.class);
        startActivity(i);
    }


}