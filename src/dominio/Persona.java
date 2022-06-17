// Martín Tabó 227665 - Mateo Mazzini 219372

package dominio;

import java.io.Serializable;

//De esta clase extienden Cliente y Empleado, debido a que comparten atributos.
public class Persona implements Serializable{
    private String nombre;
    private int cedula;
    private int telefono;
    
    //Constructor sin parámetros de la clase Persona
    public Persona(){
        this.nombre = "";
        this.cedula = 0;
        this.telefono = 0;
    }
    
    //Constructor con parámetros de la clase Persona
    public Persona(String unNombre, int unaCedula, int unTelefono){
        this.setNombre(unNombre);
        this.setCedula(unaCedula);
        this.setTelefono(unTelefono);
    }
    
    // Getters y Setters de Persona
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
    
    //------------------------------------------------//
}