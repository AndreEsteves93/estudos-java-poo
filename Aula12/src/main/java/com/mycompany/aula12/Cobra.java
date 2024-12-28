/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12;

/**
 *
 * Classe descendente
 */
public class Cobra extends Reptil {

    // Atributos
    protected boolean venenosa;

    // Métodos únicos
    public void enrolar() {
        System.out.println("Se enrolando");
    }

    // Métodos sobrepostos
    @Override
    public void alimentar() {
        System.out.println("Comendo algum pequeno animal");
    }

}
