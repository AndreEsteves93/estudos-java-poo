/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12;

/**
 *
 * Polimorfismo de sobreposição
 */
public class Reptil extends Animal {

    // Atributos
    protected String corEscama;

    // Métodos sobrepostos
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo insetos");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }

    // Métodos especiais
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}
