/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12;

/**
 *
 * Polimorfismo de sobreposição
 */
public class Peixe extends Animal {

    // Atributos
    protected String corEscama;

    // Métodos únicos
    public void soltarBolha() {
        System.out.println("blu bloblu blub bli...");
    }

    // Métodos sobrepostos
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo pequenas susbtancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }

    // Métodos especiais
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}
