/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12;

/**
 *
 * Polimorfismo de sobreposição
 */
public class Ave extends Animal {

    // Atributos
    protected String corPena;

    // Métodos únicos
    public void fazerNinho() {
        System.out.println("Contruindo um ninho");
    }

    // Métodos abstratos
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de ave");
    }

    // Métodos especiais
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

}
