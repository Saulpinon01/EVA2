/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_herencia;

/**
 *
 * @author saulp
 */
public class EVA2_5_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SubClase clase = new SubClase();
        clase.Mensaje();
    }
    
    
}
class SuperClase{
    public void Mensaje(){
        System.out.println("hola");
    }
 
}
class SubClase extends SuperClase{
    
}