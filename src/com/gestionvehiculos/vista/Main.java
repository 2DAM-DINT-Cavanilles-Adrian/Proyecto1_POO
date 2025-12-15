/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionvehiculos.vista;

/**
 *
 * @author adrgimmun
 */
public class Main {
    public static void main(String[] args) {
        // Iniciar la aplicación
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroFrame().setVisible(true);
            }
        });
    }
}
