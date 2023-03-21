/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_11_figuras;

/**
 *
 * @author saulp
 */
public class CIRCULO extends FIGURAS{
    private double radio;
    public CIRCULO() {
        this.area = 0;
        this.perimetro = 0;
        this.radio = 0;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public CIRCULO(double radio) {;
        this.radio = radio;
    }
    public double getArea() {
        area = Math.PI*(radio*radio);
        return area;
    }
    public double getPerimetro(){
        perimetro = 2*Math.PI*radio;
        return perimetro;
    }
    @Override
    public String toString(){
        area = getArea();
        perimetro = getPerimetro();
        System.out.println("Resultados:");
        String chain = "Area: " + area + "\n" + "Perimetro: " + perimetro;
        return chain;
    }
}
