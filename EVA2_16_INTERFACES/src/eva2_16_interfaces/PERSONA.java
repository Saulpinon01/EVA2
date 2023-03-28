/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_16_interfaces;

/**
 *
 * @author saulp
 */
public class PERSONA implements MOSTRARDATOS{ 
    
    private String nombre;
    private int edad;

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

    public PERSONA(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public PERSONA() {
        this.nombre = "";
        this.edad = 0;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("nombre: "+nombre);
        System.out.println("edad: "+edad);
    }
    
}
