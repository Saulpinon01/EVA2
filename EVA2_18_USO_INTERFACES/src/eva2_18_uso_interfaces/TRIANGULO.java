/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_18_uso_interfaces;

/**
 *
 * @author saulp
 */
public class TRIANGULO implements FIGURAS,MOSTRARDATOS {
    private double base;
    private double altura;

    public TRIANGULO() {
        this.base = 0;
        this.altura = 0;
    }

    public TRIANGULO(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return (base*altura)/2;
    }

    @Override
    public double calcularPerimetro() {
        
        double hip = Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
        return base+altura+hip;
        
    }

    @Override
    public void imprimirDatos() {
        System.out.println("base: "+base);
        System.out.println("altura: "+altura);
        System.out.println("area: "+area());
        System.out.println("perimetro: "+calcularPerimetro());
        
    }
    
}
