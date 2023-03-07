/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_1_uml;

import MisClases.Automovil;
import MisClases.Persona;
import MisClases.Television;

/**
 *
 * @author saulp
 */
public class EVA2_1_UML {

    public static void main(String[] args) {
        Persona pp = new Persona();
        pp.imprimirDatos();
        
    Television tele = new Television();
    tele.isPower();
    tele.isPower();
    
    tele.setCanal("58");
    tele.setVolumen(52);
    tele.imprimirDatos();
    Automovil auto = new Automovil();
    auto.setAño(2001);
    auto.setMarca("volksvagen");
    auto.setModelo("tsuru");
    auto.ImprimirDatos();
            
        
    }
}
