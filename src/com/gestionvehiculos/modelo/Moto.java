/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Clase Moto.java

package com.gestionvehiculos.modelo;

// Aplicamos Herencia: Moto extiende de Vehiculo

public class Moto extends Vehiculo {
    private int cilindrada;

    // Constructor
    
    public Moto(String marca, String color, int cilindrada) {
        super(marca, color);
        this.cilindrada = cilindrada;
    }

    // Getter y Setter para cilindrada
    
    public int getCilindrada() { return cilindrada; }
    public void setCilindrada(int cilindrada) { this.cilindrada = cilindrada; }
    
    @Override
    public String mostrarInfo() {
        
        // Llama al método del padre y añade la información propia
        
        return super.mostrarInfo() + ", Cilindrada: " + cilindrada + "cc (Moto)";
    }
}
