/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_polimorfismo_2;

import java.util.Scanner;

/**
 *
 * @author saulp
 */
public class EVA2_20_POLIMORFISMO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* CIRCULO circulo = new CIRCULO(5);
         circulo.imprimirDatos();
         // figura es padre de circulo 
         // podemos hacer un objeto circulo a una variable figura
         FIGURAS figura = circulo;
         System.out.println("");
         System.out.println("usando figuras: ");
         System.out.println("Area: "+figura.area());
         System.out.println("Perimetro: "+figura.calcularPerimetro());*/
        
       /* int[] arreglo = new int [10]; // arreglo que guarda 10 enteros 
        // un arreglo empieza en 0 y termina en n-1
        arreglo[0]=100;
        System.out.println(arreglo[0]);/*
        */
       
        System.out.println("cuantas figuras necesita?");
        Scanner input = new Scanner (System.in);
        int cant = input.nextInt();
      
        
        FIGURAS [] figuras = new FIGURAS[cant];
        
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("que tipo de figuras necesitas: 1.circulo 2.triangulo ");
            int tipo = input.nextInt();
            if (tipo == 1) { // circulo 
                CIRCULO circulo = new CIRCULO();
                System.out.println("introduce el radio: ");
                circulo.setRadio(input.nextDouble()); // capturamos el radio
                figuras[i]= circulo;
            }else{ 
                TRIANGULO triangulo = new TRIANGULO();
                System.out.println("introduce la base : ");
                triangulo.setBase(input.nextDouble());
                System.out.println("introduce la altuta:");
                triangulo.setAltura(input.nextDouble()); // capturamos el radio
                figuras[i]= triangulo;       
            }
        }
        for (int i = 0; i < figuras.length; i++) {
            if(figuras[i] instanceof CIRCULO) {      
            System.out.println("circulo: "+i);
            // casting --> conversion 
            // ejemplo 
        //int val = (int) (Math.random()*100);
        CIRCULO circulo = (CIRCULO) figuras[i];
        circulo.imprimirDatos();
        } 
            else {
                System.out.println("triangulo: "+i);
                TRIANGULO triangulo = (TRIANGULO) figuras[i];
                triangulo.imprimirDatos();
                
            } 
           // System.out.println("area: "+ figuras[i].area());
           // System.out.println("perimetro: "+figuras[i].calcularPerimetro());
    }
        
      /* CIRCULO [] circulo = new CIRCULO[cant];
       circulo [0]= new CIRCULO();      
       circulo[0].imprimirDatos();
        for (int i = 0; i < circulo.length; i++) {
            circulo[i] = new CIRCULO();
        }
         for (int i = 0; i < circulo.length; i++) {
            circulo[i].imprimirDatos();            
        }*/
    }   
}