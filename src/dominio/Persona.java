
package dominio;


public class Persona {
    private String nombre;
    private int cedula;
    private int telefono;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    public int getCedula() {
        return cedula;
    }
    public void setCedula(int unaCedula) {
        this.cedula = unaCedula;
    }

    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int unTelefono) {
        this.telefono = unTelefono;
    }
}
