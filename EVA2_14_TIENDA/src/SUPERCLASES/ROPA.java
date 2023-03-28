/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SUPERCLASES;

/**
 *
 * @author saulp
 */

public abstract class ROPA extends PRODUCTOS{
    private String talla;
    private String marca;
    private String color;

    public ROPA() {
            this.talla = "";
        this.marca = "";
        this.color = ""; 
    }

    public ROPA(String talla, String marca, String color) {
        this.talla = talla;
        this.marca = marca;
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
