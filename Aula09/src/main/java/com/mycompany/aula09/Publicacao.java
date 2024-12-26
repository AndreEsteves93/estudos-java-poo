/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.aula09;

/**
 *
 * @author Administrador
 */
public interface Publicacao {
    
    // Métodos abstratos
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int p);
    public abstract void avançarPag();
    public abstract void voltarPag();
}
