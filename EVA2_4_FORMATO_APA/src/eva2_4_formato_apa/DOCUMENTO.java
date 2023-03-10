
package eva2_4_formato_apa;

/**
 *
 * @author saulp
 */
public class DOCUMENTO {
    private String autor;
    private String titulo;
    private int año;
    private String mes;
    private int dia;
   public DOCUMENTO() {
 
    }
    public DOCUMENTO(String autor, String titulo, int año, String mes, int dia, String ciudad) {
        this.autor = autor;
        this.titulo = titulo;
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        this.ciudad = ciudad;
    }

    private String ciudad;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
    
}
