/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c6;

/**
 *
 * @author viti
 */
public class Curso {
    public int id;
    private String correo;
    public String nombre;

    public Curso() {
        this.id=(int)(Math.random()*1000)+1;
    }

     

    
    
    

    public String getCorreo() {
        return correo.substring(0,3)+ "....." 
                + correo.substring(correo.indexOf("@"));
    }

    public void setCorreo(String correo) {
        if (correo.contains("@")){
            this.correo = correo;
        }else{
            System.err.println("No es un correo valido");
        }
            
        
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
