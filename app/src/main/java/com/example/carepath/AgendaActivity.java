package com.example.carepath;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class AgendaActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton botonHomePage;
    private ImageButton botonAgenda;
    private ImageButton botonVisitante;
    private ImageButton botonNotificacion;
    private ImageButton agregar;

    private Button backAgenda;
    private Button botonNN;

    private ListView listaActividades;
    private TextView textDate;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);

        listaActividades = findViewById(R.id.listaAgenda);
        textDate = findViewById(R.id.textDate);

        botonHomePage = findViewById(R.id.botonHome);
        botonAgenda = findViewById(R.id.botonAgenda);
        botonVisitante = findViewById(R.id.botonVisita);
        botonNotificacion = findViewById(R.id.botonNotificaciones);
        agregar = findViewById(R.id.aggAgendaBtn);
        backAgenda = findViewById(R.id.backAgendaBtn);
        botonNN = findViewById(R.id.botonNN);
    }

    @Override
    public void onClick(View view) {

    }
}