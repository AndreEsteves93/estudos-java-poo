/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula10;

/**
 *
 * @author Administrador
 */
public class Aluno extends Pessoa {
    
    // Atributos
    private int matr;
    private String curso;
    
    // métodos únicos
    public void cancelarMatr() {
        System.out.println("Matrícula será cancelada.");
    }

    // Métodos especiais
    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
