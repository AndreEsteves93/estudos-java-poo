/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12;

/**
 *
 * Classe descedente
 */
public class Canguru extends Mamifero {
    
    // Métodos únicos
    public void usarBolsa() {
        System.out.println("usando a bolsa");
    }
    
    // Métodos sobrepostos 
    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
}
