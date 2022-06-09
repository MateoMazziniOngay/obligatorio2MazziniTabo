
package dominio;


public class Persona {
    private String nombre;
    private int cedula;
    private int telefono;
    
    public Persona(){
        this.nombre = "";
        this.cedula = 0;
        this.telefono = 0;
    }
    
    public Persona(String unNombre, int unaCedula, int unTelefono){
        this.setNombre(unNombre);
        this.setCedula(unaCedula);
        this.setTelefono(unTelefono);
    }
    
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
