/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_extends;

/**
 *
 * @author saulp
 */
public class EVA2_3_EXTENDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ESTUDIANTE estudiante = new ESTUDIANTE();
        estudiante.setNcontrol("22550380");
        estudiante.setNombre("saul");
        estudiante.setApellido("piñon");
        estudiante.setEdad(22);
        System.out.println("Datos Del Estudiante");
        System.out.println(estudiante.getNombre());
        System.out.println(estudiante.getApellido());
        System.out.println(estudiante.getEdad());
        System.out.println(estudiante.getNcontrol());
        
        DOCENTES doc = new DOCENTES();
        System.out.println("Datos del docente");
        doc.setNombre("juan");
        doc.setApellido("ambrosio");
        doc.setEdad(16);
        doc.setPlaza("JA154879");
        System.out.println(doc.getNombre());
        System.out.println(doc.getEdad());
        System.out.println(doc.getApellido());
        System.out.println(doc.getPlaza());
        
        
        
        
    }
    
}
