/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_polimorfismo;

/**
 *
 * @author saulp
 */
public class EVA2_19_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         DOCENTES docentes = new DOCENTES("SAUL","JUAN",22,"TEC2");
        // docentes.imprimirDatos();
         ESTUDIANTE estudiante = new ESTUDIANTE("22550380","SAUL","PIÑON",22);
        // estudiante.imprimirDatos();
         
        
        // en resumen el poliformismo es esto
        // ocultamos propiedades 
         PERSONA persona = docentes;
         persona.imprimirDatos();
         System.out.println("");
         PERSONA persona2 = estudiante;
         persona2.imprimirDatos();
         // no se pueden hacer las conversiones de super clase a subclase 
         // en este caso no existe la plaza
         PERSONA perso = new PERSONA();
 
         //DOCENTES doce = perso;


    }
    
}
