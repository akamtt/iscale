package com.example.iscale.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.iscale.R;
import com.example.iscale.model.Musica;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Musica> listaMusicas;

    public Adapter(List<Musica> lista){
        this.listaMusicas = lista;
    }


    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {

        //MÉTODO PARA CRIAR A VISUALIZAÇÃO DOS ITENS DA LISTA

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista,parent,false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull Adapter.MyViewHolder holder, int position) {
        //MÉTODO PARA EXIBIR OS ITENS DA LISTA
        Musica m = listaMusicas.get(position);
        holder.tvMusica.setText(m.getMusica());
        holder.tvArtista.setText(m.getArtista());

    }

    @Override
    public int getItemCount() {
        //QUANTIDADE DE ITENS A SER EXIBIDA
        return listaMusicas.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tvMusica;
        TextView tvArtista;




        public MyViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);

            tvMusica = itemView.findViewById(R.id.tvMusica);
            tvArtista = itemView.findViewById(R.id.tvArtista);


        }
    }


}
