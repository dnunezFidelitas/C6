/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c6;

/**
 *
 * @author viti
 */
public class Persona {
    public String nombre;
    public String id;
    private String misSecretosMasOscuros;

    public Persona() {
        this.nombre="Juan";
        this.id="0";
    
    }

    public Persona(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    
    
    public String dameMisSecretosMasOscuros(){
        return "Mis secreto es que me password es mi fecha de nacimiento";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMisSecretosMasOscuros() {
        return misSecretosMasOscuros;
    }

    public void setMisSecretosMasOscuros(String misSecretosMasOscuros) {
        this.misSecretosMasOscuros = misSecretosMasOscuros;
    }
    
    
    
}
