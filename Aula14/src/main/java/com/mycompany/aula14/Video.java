/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula14;

/**
 *
 * @author Administrador
 */
public class Video implements AcoesVideo {

    // Atributos
    private String titulo;
    private int avaliacao;
    private int views, curtidas;
    private boolean reproduzindo;

    // Construtor
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    // Métodos especiais
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo
                + ", avaliacao=" + avaliacao
                + ", views=" + views
                + ", curtidas=" + curtidas
                + ", reproduzindo=" + reproduzindo + '}';
    }

    // Métodos abstratos implementados da interface AcoesVideo
    @Override
    public void play() {
        reproduzindo = true;
    }

    @Override
    public void pause() {
        reproduzindo = false;
    }

    @Override
    public void like() {
        curtidas++;
    }

}
