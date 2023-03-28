/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_19_polimorfismo;

/**
 *
 * @author saulp
 */
public class DOCENTES extends PERSONA {
    private String plaza;
    
    public DOCENTES(){
        super();
        this.plaza = "----";
    }
   public DOCENTES(String nombre,String apellido,int edad,String plaza){
       super(nombre,apellido,edad);
       this.plaza = plaza;      
   }
    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    
    @Override
    public void imprimirDatos(){
    super.imprimirDatos();
        System.out.println("plaza: "+plaza);
        
}
    
}
