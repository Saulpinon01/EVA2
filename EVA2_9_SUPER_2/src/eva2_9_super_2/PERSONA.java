/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_super_2;

/**
 *
 * @author saulp
 */
public class PERSONA {
    private String nombre="----";
    private String apellido="----";
    private int edad=-1;

    public PERSONA(String nombre, String apellido,int edad) {

        this.nombre = "----";
        this.apellido = "----";
        this.edad = -1;
        
    }
public PERSONA(){
    
}


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void imprimirDatos(){
        System.out.println("DATOS");
        System.out.println("NOMBRE: "+this.nombre);
        System.out.println("APELLIDO: "+this.apellido);
        System.out.println("EDAD"+this.edad);
}
}


