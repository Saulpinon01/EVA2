
package eva2_19_polimorfismo;

/**
 *
 * @author saulp
 */
public class ESTUDIANTE extends PERSONA {
    public String Ncontrol;

    public ESTUDIANTE(String saul, String pinon, int edad) {
     super();// llamada al constructor de la super clase 
     this.Ncontrol = "-----";
    }

    public ESTUDIANTE(String Ncontrol,String nombre,String apellido,int edad) {
        super(nombre, apellido, edad);
        this.Ncontrol = Ncontrol;
    }
    


    public String getNcontrol() {
        return Ncontrol;
    }

    public void setNcontrol(String Ncontrol) {
        this.Ncontrol = Ncontrol;
    }
    @Override
     public void imprimirDatos(){
         super.imprimirDatos();
         System.out.println("no de control: "+Ncontrol);
}
}
