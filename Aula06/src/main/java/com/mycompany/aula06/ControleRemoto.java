/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula06;

/**
 *
 * @author angae
 */
public class ControleRemoto implements Controlador {

    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos especiais
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Métodos Abstratos
    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("----- MENU -----");
        System.out.println("Está ligado? " + isLigado());
        System.out.println("Está tocando? " + isTocando());
        System.out.print("Volume: " + getVolume() + " ");
        for (int i = 0; i < getVolume(); i += 10) {
            System.out.print("/");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (isLigado()) {
            setVolume(getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (isLigado()) {
            setVolume(getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if (isLigado() && getVolume() > 0) {
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (isLigado() && getVolume() == 0) {
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if (isLigado() && !isTocando()) {
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (isLigado() && isTocando()) {
            setTocando(false);
        }
    }
}
