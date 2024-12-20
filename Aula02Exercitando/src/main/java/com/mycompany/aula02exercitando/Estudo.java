/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula02exercitando;

/**
 *
 * @author angae
 */
public class Estudo {
    String assunto;
    int tempo;
    boolean estudando;
    
    void status() {
        if (this.estudando == true) {
        System.out.println("Está estudando " + this.assunto + " por " + this.tempo + " hora(s).");
        } else {
            System.out.println("Não está estudando.");
        }
    }
    
    void estudar(String topico, int horas) {
        assunto = topico;
        tempo = horas;
        this.estudando = true;
    }
    
    void pararDeEstudar() {
        assunto = "";
        tempo = 0;
        this.estudando = false;
    }
}
