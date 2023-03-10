/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_2_herencia;

/**
 *
 * @author saulp
 */
public class ESTUDIANTE {
    private String nombre;
    private String apellido;
    private int edad;
    private int Ncontrol;

    public ESTUDIANTE(String nombre, String apellido, int edad, int Ncontrol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.Ncontrol = Ncontrol;
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

    public int getNcontrol() {
        return Ncontrol;
    }

    public void setNcontrol(int Ncontrol) {
        this.Ncontrol = Ncontrol;
    }
    
}
