/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author saulp
 */
public class Persona {
    
    int ID = 28173;
    String Nombre = "saul";
    int Edad = 22;

        
    public String getNombre(String n){
        return n;
    }
    public int getEdad(int e){
        return e;
    }
    public int getID(int i){
        return i;
    }
    public void setNombre(String nombre){
        Nombre = nombre;
    }
    public void setEdad(int edad){
        Edad = edad;
    }
    public void setID(int id){
        ID = id;
    }  
public void imprimirDatos(){
    System.out.println("Datos: "+Nombre+" "+Edad+" "+ID );
}
}   
   

