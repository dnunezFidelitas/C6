/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c6;

/**
 *
 * @author viti
 */
public class C6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona juan = new Persona();
        //System.out.println(juan.dameMisSecretosMasOscuros());
        System.out.println("id: "+juan.id);
        System.out.println("nombre: "+juan.nombre);
        
        
        Persona pedro = new Persona("Pedro", "1");
        System.out.println("id: "+pedro.id);
        System.out.println("nombre: "+pedro.nombre);
        /*
        Animal boby = new Animal();
        
        boby.getMasaCorporal();
        
        Curso SC202 = new Curso();
        //SC202.setCorreo("Noesuncorreo");
        SC202.setCorreo("correo@gmail.com");
        System.out.println(SC202.getCorreo());
        */
        
        
    }
    
}
