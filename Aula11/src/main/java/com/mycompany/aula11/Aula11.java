/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula11;

/**
 *
 * @author Administrador
 */
public class Aula11 {

    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante("Pedro", 43, "M");
        Aluno a1 = new Aluno("João", 16, 1111, "Mecânica");
        Bolsista b1 = new Bolsista("Martia", 15, 9999, "Edificações", 007);
        
        a1.setSexo("M");
        b1.setSexo("F");
        
        System.out.println(a1.detalhes());
        System.out.println(v1.detalhes());
        System.out.println(b1.detalhes());
        
        a1.pagarMensalidade();
        b1.pagarMensalidade();
    }
}
