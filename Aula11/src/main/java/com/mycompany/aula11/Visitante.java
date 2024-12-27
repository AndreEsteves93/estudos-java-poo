/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula11;

/**
 * "herança fraca" Herança de implementação
 *  Adicionando um construtor continua sendo uma herança de implementação
 */
public class Visitante extends Pessoa {
    
    // Construtor
    public Visitante(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
}
