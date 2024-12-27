/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula11;

/**
 * Classe descendente da root Pessoa herda Pessoa e Aluno e tbm da override de
 * um métodod de Aluno
 */
public class Bolsista extends Aluno {

    // Atributos
    private int bolsa;

    // Construtor
    public Bolsista(String nome, int idade, int matricula, String curso, int bolsa) {
        super(nome, idade, matricula, curso);
        this.bolsa = bolsa;
    }

    // Métodos únicos
    public void renovarBolsa() {
        System.out.println("Renovando a bolsa de " + nome);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Mensalidade de R$300 paga.");
    }

    // Métodos especiais
    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
}
