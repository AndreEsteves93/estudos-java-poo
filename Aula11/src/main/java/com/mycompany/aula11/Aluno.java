/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula11;

/**
 * override em detalhes adicionando mais dados
 * 
 */
public class Aluno extends Pessoa {

    // Atributos
    private int matricula;
    private String curso;

    // Construtor
    public Aluno(String nome, int idade, int matricula, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.curso = curso;
    }

    // Métodos unicos
    public void pagarMensalidade() {
        System.out.println("Mensalidade de R$1000 paga");
    }

    // Métodos especiais
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String detalhes() {
        return super.detalhes() + "{" + "matricula=" + matricula + ", curso=" + curso + '}';

    }

}
