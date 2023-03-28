
package eva2_16_interfaces;

/**
 *
 * @author saulp
 */
public class EVA2_16_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //MOSTRARDATOS datos = new MOSTRARDATOS();
        PERSONA persona = new PERSONA("juan",20);
        persona.imprimirDatos();
        
        COMPUTADORA computadora = new COMPUTADORA("lenovo","amd",20192,"lenovo legyon");
        System.out.println("");
        computadora.imprimirDatos();
    }
    
}
