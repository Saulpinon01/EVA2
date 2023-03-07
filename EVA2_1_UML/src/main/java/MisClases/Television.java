/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author saulp
 */
public class Television {
    String Canal = "6";
    int Volumen = 33;
    boolean Power = true;

    public String getCanal() {
        return Canal;
    }

    public void setCanal(String Canal) {
        this.Canal = Canal;
    }

    public int getVolumen() {
        return Volumen;
    }

    public void setVolumen(int Volumen) {
        this.Volumen = Volumen;
    }

    public boolean isPower() {
        return Power;
    }

    public void setPower(boolean power) {
        this.Power = power;
    }
    public void imprimirDatos(){
        System.out.println("CANAL.- "+Canal);
        System.out.println("VOLUMEN.- "+Volumen);
        System.out.println("ESTADO.- "+Power);
    }
    
    
}
