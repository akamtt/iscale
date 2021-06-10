package com.example.iscale.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.iscale.R;

import static com.example.iscale.R.id.tvMusica;

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

    }
}