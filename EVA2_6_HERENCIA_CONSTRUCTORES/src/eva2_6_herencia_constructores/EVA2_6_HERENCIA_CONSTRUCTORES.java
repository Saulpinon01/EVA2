
package eva2_6_herencia_constructores;


public class EVA2_6_HERENCIA_CONSTRUCTORES {

   
    public static void main(String[] args) {
        System.out.println("CLASE ANIMAL");
        ANIMAL animal = new ANIMAL();       
        animal.comer();
        animal.respirar();
        
        System.out.println("CLASE MAMIFERO");
        MAMIFERO mamifero = new MAMIFERO();
     
        
    }
    
}
