package com.example.iscale.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;

import com.example.iscale.R;
import com.example.iscale.adapter.Adapter;
import com.example.iscale.model.Musica;
import com.example.iscale.util.RecyclerItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Musica> musicas = new ArrayList<>();


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       recyclerView = findViewById(R.id.LinearLayout);

       //LISTAGEM DE MUSICAS
        this.criarMusicas();

        //CONFIGURAR O ADAPTER

        Adapter adapter = new Adapter(musicas);

        //CONFIGURAR O RECYCLERVIEW

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager( layoutManager );
        recyclerView.setHasFixedSize( true );

        //INSERINDO UMA LINHA ENTRE CADA ITEM
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));

        recyclerView.setAdapter( adapter );

        //EVENTO DE CLICK

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                //START DA OUTRA ACTIVITY
                                Intent intent = new  Intent(getApplicationContext(), InfoActivity.class);
                                startActivity(intent);

                            }

                            @Override
                            public void onLongItemClick(View view, int position) {

                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        }
                )

        );
    }

    public void criarMusicas(){

        Musica m = new Musica("Leave Out All The Rest", "Linkin Park", "Minutes to Midnight", "duracao", "Warner Bros. Records", R.drawable.minutes_to_midnight );
        musicas.add(m);

        m = new Musica("Into The Storm", "Gojira", "Fortitude", "duracao", "Roadrunner Records", R.drawable.fortitude);
        musicas.add(m);

        m = new Musica("Heavydirtysoul", "Twenty One Pilots", "Blurryface", "dura", "Fueled By Ramen", R.drawable.blurryface);
        musicas.add(m);

        m = new Musica("A Nightmare to Remember", "Dream Theater", "Black Clouds & Silver Linings", "duracao", "WM Australia", R.drawable.black_silver);
        musicas.add(m);

        m = new Musica("Broken Hands", "Lamb of God", "Wrath", "duracao", "Roadrunner Records", R.drawable.wrath);
        musicas.add(m);

        m = new Musica("How Deep is Your Love", "Bee Gees", "How Can You Mend a Broken Heart", "duracao", "RSO Records", R.drawable.how_can);
        musicas.add(m);

        m = new Musica("Battery", "Metallica", "Master of Puppets", "duracao", "Elektra Records", R.drawable.master_of_puppets);
        musicas.add(m);

        m = new Musica("A Tout Le Monde", "Megadeth", "Youthanasia", "duracao", "Capitol Records", R.drawable.youthanasia);
        musicas.add(m);

        m = new Musica("Puro Sangue", "Charlie Brown Jr", "Camisa 10 Joga Bola até na chuva", "duracao", "EMI Music Brasil", R.drawable.camisa10);
        musicas.add(m);

        m = new Musica("GNAT", "Eminem", "Music to Be Murdered By - Side B", "duracao", "Shady Records e Interscope Records", R.drawable.murderby_sideb);
        musicas.add(m);

        m = new Musica("Leave the Door Open", "Silk Sonic", "Leave the Door Open (Single)", "duracao", "Aftermath Records e Atlantic Records", R.drawable.silksonic);
        musicas.add(m);

        m = new Musica("Congratulations", "Post Malone", "Stoney", "duracao", "Republic Records", R.drawable.stoney);
        musicas.add(m);

        m = new Musica("Innervision", "System of a Down", "Steal This Album", "duracao", "Columbia Records", R.drawable.steal_this_album);
        musicas.add(m);




    }

}
