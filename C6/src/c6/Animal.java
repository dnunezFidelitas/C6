/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c6;

/**
 *
 * @author viti
 */
public class Animal {
    
    private String nombre;
    private int id;
    private double altura;
    private double peso;
    
    public double getMasaCorporal(){
        return altura*peso+0.20;
    }
    
}
