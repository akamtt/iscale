package com.example.iscale.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Musica implements Parcelable {

    private String Musica;
    private String Artista;
    private String Album;
    private String Duracao;
    private String Gravadora;
    private int AlbumArt;

    public Musica(String musica, String artista, String album, String duracao, String gravadora, int albumArt) {
        Musica = musica;
        Artista = artista;
        Album = album;
        Duracao = duracao;
        Gravadora = gravadora;
        AlbumArt = albumArt;
    }

    protected Musica(Parcel in) {
        Musica = in.readString();
        Artista = in.readString();
        Album = in.readString();
        Duracao = in.readString();
        Gravadora = in.readString();
        AlbumArt = in.readInt();
    }

    public static final Creator<Musica> CREATOR = new Creator<Musica>() {
        @Override
        public Musica createFromParcel(Parcel in) {
            return new Musica(in);
        }

        @Override
        public Musica[] newArray(int size) {
            return new Musica[size];
        }
    };

    public String getMusica() {
        return Musica;
    }

    public void setMusica(String musica) {
        Musica = musica;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String artista) {
        Artista = artista;
    }

    public int getAlbumArt() {
        return AlbumArt;
    }

    public void setAlbumArt(int albumArt) {
        AlbumArt = albumArt;
    }

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }

    public String getDuracao() {
        return Duracao;
    }

    public void setDuracao(String duracao) {
        Duracao = duracao;
    }

    public String getGravadora() {
        return Gravadora;
    }

    public void setGravadora(String gravadora) {
        Gravadora = gravadora;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Musica);
        dest.writeString(Artista);
        dest.writeString(Album);
        dest.writeString(Duracao);
        dest.writeString(Gravadora);
        dest.writeInt(AlbumArt);
    }
}
