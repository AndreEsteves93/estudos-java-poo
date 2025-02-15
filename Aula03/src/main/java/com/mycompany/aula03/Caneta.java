/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula03;

/**
 * Definindo visibilidade para os atributos e metodos
 * 
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada = true;
    
    public void status() {
        System.out.println("Modelo da caneta: " + this.modelo);
        System.out.println("A cor é " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO!Não posso rabiscar");
        } else {
            System.out.println("Estou Rabiscando");
        }
    }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
}   
