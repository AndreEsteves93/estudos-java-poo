/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teste;

import java.util.Random;

/**
 *
 * Formas diferentes de gerar um valor aleatório
 */
public class TESTE {

    public static void main(String[] args) {
        int vencedor = (int) (Math.random() * 3);
        System.out.println(vencedor);
        Random aleatorio = new Random();
        int num = aleatorio.nextInt(3);
        System.out.println(num);
    }
}
