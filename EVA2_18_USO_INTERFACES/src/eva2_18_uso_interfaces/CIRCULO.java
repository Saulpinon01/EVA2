/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_18_uso_interfaces;

/**
 *
 * @author saulp
 */
public class CIRCULO implements FIGURAS,MOSTRARDATOS{
    private double radio;

    public CIRCULO() {
        this.radio = 0;
    }

    public CIRCULO(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radio,2);
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI*(radio*2);
            
    }

    @Override
    public void imprimirDatos() {
        
        System.out.println("radio: "+radio);
        System.out.println("area: "+area());
        System.out.println("perimetro: "+calcularPerimetro());
    }
}
