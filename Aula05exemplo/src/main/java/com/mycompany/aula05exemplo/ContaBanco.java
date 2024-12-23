/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05exemplo;

/**
 *
 * @author angae
 */
public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    public void estadoAtual() {
        System.out.println("----------------------");
        System.out.println("Número da conta: " + getNumConta());
        System.out.println("Tipo da Conta: " + getTipo());
        System.out.println("Proprietário: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Está aberta? " + getStatus());
    }

    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t.equals("CP")) {
            setSaldo(150);
            System.out.println("Conta Poupança aberta com saldo inicial de R$" + getSaldo());
        } else if (t.equals("CC")) {
            setSaldo(50);
            System.out.println("Conta Corrente aberta com saldo inicial de R$" + getSaldo());
        }
    }

    public void fecharConta() {
        if (getSaldo() == 0) {
            setStatus(false);
            System.out.println("Conta fechada com sucesso");
        } else if (getSaldo() < 0) {
            System.out.println("A conta possui débito de R$" + getSaldo() + ". Portanto não pode ser fechada.");
        } else {
            System.out.println("A conta possui saldo de R$" + getSaldo() + ". Pontanto não pode ser fechada.");
        }
    }

    public void depositar(float d) {
        if (getStatus()) {
            setSaldo(getSaldo() + d);
            System.out.println("Deposito de R$" + d + " efetuado com êxito.");
        } else {
            System.out.println("A conta não está aberta. Deposito não efetuado.");
        }
    }

    public void sacar(float d) {
        if (getStatus()) {
            if (getSaldo() >= d) {
                setSaldo(getSaldo() - d);
                System.out.println("Saque de R$" + d + " efetuado com êxito.");
            } else {
                System.out.println("O saldo é insulficiente. Saque não efetuado");
            }
        } else {
            System.out.println("A conta não está aberta. Saque não efetuado.");
        }
    }

    public void pagarMensal() {
        float v = 0;
        if (tipo.equals("CC")) {
            v = 12;
        } else if (tipo.equals("CP")) {
            v = 20;
        }
        if (getStatus()) {
            if (getSaldo() >= v) {
                setSaldo(getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Conta inativa. Impossível pagar");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
