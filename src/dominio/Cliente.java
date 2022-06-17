// Martín Tabó 227665 - Mateo Mazzini 219372

package dominio;
import java.io.Serializable;

public class Cliente extends Persona implements Serializable{
    private String mail;
    
    //Constructor sin parámetros de la clase Cliente
    public Cliente(){
        Persona persona = new Persona("",0,0);
        this.mail = "";
    }
    
    //Constructor con parámetros de la clase Cliente
    public Cliente(String unNombre, int unaCedula, int unTelefono, String unMail){
        super.setCedula(unaCedula);
        super.setNombre(unNombre);
        super.setTelefono(unTelefono);
        this.setMail(unMail);
    }
    
    
    // Getters y Setters de Cliente 
    
    public String getMail() {
        return mail;
    }

    public void setMail(String unMail) {
        this.mail = unMail;
    }
    
    //------------------------------------------------//

    // Métodos

    @Override
    //toString() de Cliente.
    public String toString(){
        return 
            "Nombre: " + super.getNombre() + 
            ", CI: " + super.getCedula() + 
            ", Tel: " + super.getTelefono() + 
            ", Mail: " + this.getMail();
    }
    
    //equals() de Cliente, nos dice si dos clientes son iguales.
    public boolean equals(Cliente unCliente){
        boolean ni = this.getNombre().equals(unCliente.getNombre());
        boolean ci = this.getCedula() == unCliente.getCedula();
        boolean ti = this.getTelefono() == unCliente.getTelefono();
        boolean mi = this.getMail().equals(unCliente.getMail());
        
        return (ni && ci && ti && mi);
    }
    
    //---------------------------------------------//
}
