/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_16_interfaces;

/**
 *
 * @author saulp
 */
public class COMPUTADORA extends PRODUCTO // heredamos de clases 
   implements MOSTRARDATOS{// implementamos interfaces
    private String marca;
    private String procesador;

    public COMPUTADORA() {
          this.marca = "";
        this.procesador = "";
    }

    public COMPUTADORA(String marca, String procesador, double precio, String nombre) {
        super(precio, nombre);
        this.marca = marca;
        this.procesador = procesador;
    }

   

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("nombre del producto: "+getNombre());
        System.out.println("marca: "+marca);
        System.out.println("procesador: "+procesador);
        System.out.println("precio: "+getPrecio());
    }
}
