package com.example.iscale.model;

public class Musica {

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
}
