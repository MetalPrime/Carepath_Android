package com.example.carepath;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class VisitanteActivity extends AppCompatActivity implements View.OnClickListener {

    private FirebaseDatabase database;
    private FirebaseAuth auth;

    private ImageView botonHomePage;
    private ImageView botonAgenda;
    private ImageView botonVisitante;
    private ImageView botonNotificacion;
    private ImageView agregar;

    private Button backVisitante;

    //informacion a mostrar
    private ListView listaVisitantes;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitante);

        database = FirebaseDatabase.getInstance();
        auth = FirebaseAuth.getInstance();

        if (auth.getCurrentUser() != null) {
            listaVisitantes = findViewById(R.id.listaVisitantes);

            botonHomePage = findViewById(R.id.botonHome);
            botonAgenda = findViewById(R.id.botonAgenda);
            botonVisitante = findViewById(R.id.botonVisita);
            botonNotificacion = findViewById(R.id.botonNotificaciones);
            agregar = findViewById(R.id.aggVisitanteBtn);
            backVisitante = findViewById(R.id.backVisitanteBtn);

            botonHomePage.setOnClickListener(this);
            botonAgenda.setOnClickListener(this);
            botonVisitante.setOnClickListener(this);
            botonNotificacion.setOnClickListener(this);
            agregar.setOnClickListener(this);
            backVisitante.setOnClickListener(this);
        }
        else {
            fueraDeLaPAgina();

        }
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.backVisitanteBtn:
                Intent i = new Intent(this,MainActivity.class);
                startActivity(i);
                finish();
                break;

            case R.id.aggVisitanteBtn:
                Intent j = new Intent(this,RegistroVisitaActivity.class);
                startActivity(j);
                finish();
                break;

            case R.id.botonHome:
                break;

            case R.id.botonAgenda:
                break;

            case R.id.botonVisita:
                break;

            case R.id.botonNotificaciones:
                break;
        }

    }

    private void fueraDeLaPAgina() {

        Intent l = new Intent(this, LoginRegistroInquilino.class);
        startActivity(l);
        finish();

    }
}