/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_protected;

import PRUEBA.SUPERCLASE;


public class EVA2_15_PROTECTED {

   // se puede ver los atributos y metodos entre las clsases relacionadas por herencia y se comporta como default: acceso de nivel paquete 
    public static void main(String[] args) {
        // TODO code application logic here
        // public - restrictivo
        //protected 
        //default 
        // private + restrictivo
        
        
        
    }
    
}

class SubClase extends SUPERCLASE{
    public void imprimirValor(){
        System.out.println("el valor es:" + valor);
    }
}