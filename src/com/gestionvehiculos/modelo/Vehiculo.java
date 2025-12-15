/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Clase Vehiculo.java

package com.gestionvehiculos.modelo;

public class Vehiculo {
    
    // 1. Atributos (Encapsulamiento: deben ser private)
    
    private String marca;
    private String color;

    // 2. Constructor
    
    public Vehiculo(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    // 3. Getters y Setters (para acceder a los atributos privados)
    
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    // 4. Método mostrarInfo() (Requisito 1)
    
    public String mostrarInfo() {
        return "Marca: " + marca + ", Color: " + color;
    }
}
