/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula04;

/** setter
 *  getter
 *  constructor
 */
public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Azul", 0.7f);
        Caneta c2 = new Caneta("Pilot", "Preta", 1.0f);
        c2.setModelo("BIC");
        c2.setPonta(0.5f);
        c1.status();
        System.out.println("Tenho uma caneta " + c2.getModelo() + " de ponta " + c2.getPonta());
        c2.destampar();
        c2.status();
    }
}
