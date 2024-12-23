/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula05exemplo;

/**
 * Exemplo prático POO
 * 
 */
public class Aula05exemplo {

    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(1111);
        c1.setDono("Jubileu");
        c1.abrirConta("CC");
        
        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(2222);
        c2.setDono("Creuza");
        c2.abrirConta("CP");
        
        c1.depositar(300);
        c2.depositar(500);
        
        c2.sacar(100);
        c1.sacar(350);
        
        c1.fecharConta();
        
        c1.estadoAtual();
        c2.estadoAtual();
    }
}
