
package eva2_21_poliformismo_vehiculos;

/**
 *
 * @author saulp
 */
public class EVA2_21_POLIFORMISMO_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Automovil auto = new Automovil("ford","mustang",2019,0);
        modificarVel(auto,20);
        Bicicleta bici = new Bicicleta("montaña","apache",0);
        modificarVel(bici,10);
        
    }
    
    public static void modificarVel(ControlarDatos datos, int vel){
        datos.cambiarVelocidad(vel);
        datos.tablero();
        
    }
    
}

class Vehiculo{
    private String marca;
    protected int velocidad;

    public Vehiculo() {
          this.marca = "sin datos";
        this.velocidad = 0;
    }

    public Vehiculo(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}

interface ControlarDatos{
    void cambiarVelocidad(int cambio);
    public abstract void tablero();
}

class Automovil extends Vehiculo implements ControlarDatos{
    private String modelo;
    private int año;

    public Automovil() {
        super();
        this.modelo = "sin datos";
        this.año = 0;
    }

    public Automovil(String marca,String modelo, int año, int velocidad) {
        super(marca,velocidad);
        this.modelo = modelo;
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public void cambiarVelocidad(int cambio) {
        int vel = velocidad + cambio;
        if (vel>=0) {
            velocidad=vel;
        }
    }

    @Override
    public void tablero() {
        System.out.println("Atomovil:");
        System.out.println("velocidad: "+velocidad);
        System.out.println("combustible (pendiente)");
        System.out.println("revoluciones (pendiente)");
    }
}

class Bicicleta extends Vehiculo implements ControlarDatos{
    private String tipo;

    public Bicicleta() {
        
    }

    public Bicicleta(String tipo,String marca, int velocidad) {
        super(marca, velocidad);
        this.tipo = tipo;
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void cambiarVelocidad(int cambio) {
         int vel = velocidad + cambio;
        if (vel>=0) {
            velocidad=vel;
        }
    }

    @Override
    public void tablero() {
        System.out.println("");
        System.out.println("Bicicleta:");
        System.out.println("velocidad: "+velocidad);
    }
    
}