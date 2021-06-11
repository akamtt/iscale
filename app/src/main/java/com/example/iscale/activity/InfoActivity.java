package com.example.iscale.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.iscale.R;
import com.example.iscale.model.Musica;

public class InfoActivity extends AppCompatActivity {

    private TextView rpMusica;
    private TextView rpArtista;
    private TextView rpAlbum;
    private TextView rpDuracao;
    private TextView rpGravadora;
    private ImageView ivAlbumart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Musica musica = getIntent().getParcelableExtra("musica");
        Log.d("Musica", "OnCreate: "+ musica.getAlbum());



    }
}