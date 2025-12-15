/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Clase Auto.java

package com.gestionvehiculos.modelo;


public class Auto extends Vehiculo {
    private String tipoCombustible;

    // Constructor que llama al constructor de la clase padre (super)
    
    public Auto(String marca, String color, String tipoCombustible) {
        super(marca, color); // Llama al constructor de Vehiculo
        this.tipoCombustible = tipoCombustible;
    }

    // Getter y Setter para tipoCombustible
    
    public String getTipoCombustible() { return tipoCombustible; }
    public void setTipoCombustible(String tipoCombustible) { this.tipoCombustible = tipoCombustible; }

    // Aplicamos Polimorfismo: Sobrescribimos mostrarInfo() (Requisito 2)
    
    @Override
    public String mostrarInfo() {
        
        // Llama al método del padre y añade la información propia
        
        return super.mostrarInfo() + ", Tipo Combustible: " + tipoCombustible + " (Auto)";
    }
}
