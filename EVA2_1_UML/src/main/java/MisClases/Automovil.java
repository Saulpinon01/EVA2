/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author saulp
 */
public class Automovil {

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }
    String Marca;
    String Modelo;
    int Año;
    
    public void ImprimirDatos(){
        System.out.println(Marca);
        System.out.println(Modelo);
        System.out.println(2001);
}
    
}
