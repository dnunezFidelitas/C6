/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c6.pkg2;

/**
 *
 * @author viti
 */
public class C62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro pichirulo= new Carro("N1025", "Tengo malo las llantas");
        pichirulo.setMisDefectos("Tengo malo las llantas" + " tengo malo cluth");
        System.out.println("Mi placa es "+pichirulo.getPlaca());
        System.out.println("Mis defectos "+pichirulo.getMisDefectos());
    }
    
}
