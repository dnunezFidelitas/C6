/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c6.pkg2;

/**
 *
 * @author viti
 */
public class Carro {
    public String placa;
    private String misDefectos;

    public Carro(String placa, String misDefectos) {
        this.placa = placa;
        this.misDefectos = misDefectos;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMisDefectos() {
        if (this.placa.compareTo("C1020")==0)
            return "Soy perfecto comprame";
        return this.misDefectos;
    }

    public void setMisDefectos(String misDefectos) {
        this.misDefectos = misDefectos;
    }
    
    
    
    
}
