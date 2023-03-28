

package PRODUCTOS;

import SUPERCLASES.ROPA;



/**
 *
 * @author saulp
 */
public class JEANS extends ROPA{
    private String estilo; 
    private String material;
  
   

    public JEANS(String estilo, String material) {
        this.estilo = estilo;
        this.material = material;
       
    }

    public JEANS() {
        this.estilo = "";
        this.material = ""; 
       
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public double precioVenta(int cantidad) {
        
        // antes de cierta cantidad manejamos precio normal
        // despues de cierta cantidad hay un descuento
        
        if (cantidad<= 10) 
            return precio * cantidad;
        else 
            return (precio*0.20)*cantidad;
        
            
        
    
    
}
    @Override
    public String toString(){
        String chain = "el precio final es: "+precio;
        return chain;
    }

    
}
