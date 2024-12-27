/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula11;

/**
 * Criando a primeira classe abstrata (não pode ser instanciada) com um método
 * final que não pode ser sobrescrito (override)
 * Colocando os atributos como protected posso alterar nas subclasses
 * sem a necessidade de utilizar getter e setters.
 */
public abstract class Pessoa {

    // Atributos
    protected String nome;
    protected int idade;
    protected String sexo;

    //Métodos únicos
    public final void fazerAniv() {
        idade++;
    }

    // Métodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String detalhes() {
        return "Dados{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
}
