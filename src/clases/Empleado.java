package clases;


public class Empleado extends Persona{
    
    private String direccion;
    private int anioIngreso;
    
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
}
