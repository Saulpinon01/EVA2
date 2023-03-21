package eva2_9_super_2;

/**
 *
 * @author saulp
 */
public class EVA2_9_SUPER_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ESTUDIANTE estudiante = new ESTUDIANTE("saul","pinon",21);
        estudiante.imprimirDatos();
     
        
        DOCENTES docentes = new DOCENTES();
        docentes.imprimirDatos();
        System.out.println("Nplaza"+docentes.getPlaza());
    }
    
}
