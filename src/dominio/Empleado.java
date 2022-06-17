// Martín Tabó 227665 - Mateo Mazzini 219372

package dominio;

import java.io.Serializable;


public class Empleado extends Persona implements Serializable{
    
    private String direccion;
    private int anioIngreso;
    
    
    //Constructor sin parámetros de la clase Empleado
    public Empleado(){
        Persona persona = new Persona("",0,0);
        this.direccion = "";
        this.anioIngreso = 0;
    }
    
    //Constructor con parámetros de la clase Empleado
    public Empleado(String unNombre, int unaCedula, int unTelefono, String unaDireccion, int unAnio){
        super.setNombre(unNombre);
        super.setCedula(unaCedula);
        super.setTelefono(unTelefono);
        this.setDireccion(unaDireccion);
        this.setAnioIngreso(unAnio);
    }
        
    // Getters y Setters de Empleado
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String unaDireccion) {
        this.direccion = unaDireccion;
    }
    
    public int getAnioIngreso() {
        return anioIngreso;
    }
    
    public void setAnioIngreso(int unAnioIngreso) {
        this.anioIngreso = unAnioIngreso;
    } 
    
    //------------------------------------------------//

    // Métodos
    
    //toString() de la clase Empleado
    @Override
    public String toString(){
        return 
            "Nombre: " + super.getNombre() + 
            ", CI: " + super.getCedula() + 
            ", Tel: " + super.getTelefono() + 
            ", Dir: " + this.getDireccion() + 
            ", Año: " + this.getAnioIngreso();
    }

    //equals() de Empleado, nos dice si dos empleados son iguales.
    public boolean equals(Empleado unEmpleado){
        boolean ni = this.getNombre().equals(unEmpleado.getNombre());
        boolean ci = this.getCedula() == unEmpleado.getCedula();
        boolean ti = this.getTelefono() == unEmpleado.getTelefono();
        boolean di = this.getDireccion().equals(unEmpleado.getDireccion());
        boolean ai = this.getAnioIngreso() == unEmpleado.getAnioIngreso();
        
        return (ni && ci && ti && di && ai);
    }
    //---------------------------------------------//
}
