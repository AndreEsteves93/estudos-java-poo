/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula13;

/**
 * Subclasse de Animal
 *
 */
public class Mamifero extends Animal {

    // Atributos
    protected String corPelo;

    // Métodos sobrepostos
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }

    // Métodos especiais
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

}
