/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_tienda;

import PRODUCTOS.COMPUTADORA;
import PRODUCTOS.JEANS;

/**
 *
 * @author saulp
 */
public class EVA2_14_TIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    COMPUTADORA computadora = new COMPUTADORA();
    computadora.precioVenta(11);
    JEANS jeans = new JEANS();
    jeans.precioVenta(10);
        System.out.println(jeans);
    }
    
}
