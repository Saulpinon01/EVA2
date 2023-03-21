/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_11_figuras;

/**
 *
 * @author saulp
 */
public class FIGURAS { 
    public double area;
    public double perimetro;
    public FIGURAS() {
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public FIGURAS(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }
    public void imprimirDatos(){
        System.out.println("area: " + area);
        System.out.println("perimetro: " + perimetro);
    }
}
