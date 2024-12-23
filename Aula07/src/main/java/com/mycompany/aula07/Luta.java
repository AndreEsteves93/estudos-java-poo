/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula07;

/**
 * desafiado e desafiante são uma instancia de Lutador. um objeto de lutador.
 * São um tipo abstrato.
 *
 */
public class Luta {

    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            aprovada = true;
            desafiado = l1;
            desafiante = l2;
        } else {
            aprovada = false;
            desafiado = null;
            desafiante = null;
        }
    }

    public void lutar() {
        if (aprovada) {
            desafiado.apresentar();
            desafiante.apresentar();
            System.out.println("====== Resultado da luta======");
            int vencedor = (int) (Math.random() * 3);
            switch (vencedor) {
                case 0:
                    System.out.println("A luta terminou em empate.");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(desafiado.getNome() + " venceu a luta!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(desafiante.getNome() + " venceu a luta!");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }
        } else {
            System.out.println("Luta não pode acontecer");
        }
        System.out.println("==============================");
    }

    //Métodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
