/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_override;

/**
 *
 * @author saulp
 */
public class EVA2_10_OVERRIDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       persona per = new persona();
       persona per2 = new persona("saul",21);
       
        System.out.println(per);
        System.out.println(per2);
       
    }
}


class persona{
   private String nombre;
    private int edad ;

    public persona() {
        this.nombre = "----";
        this.edad = 0;
        
    }

    
    public persona(String nombre, int edad) {
        this.nombre = "saul";
        this.edad = 21;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
   @Override
    public String toString(){
        String cade = "datos : \n" +
                "nombre: " + nombre + "\n" +
                "edad " + edad;
        return cade;
    }
}

