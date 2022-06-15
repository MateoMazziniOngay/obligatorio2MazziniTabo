package dominio;
import java.io.Serializable;

public class Cliente extends Persona implements Serializable{

    private String mail;

    public String getMail() {
        return mail;
    }

    public void setMail(String unMail) {
        this.mail = unMail;
    }
    
    public Cliente(){
        Persona persona = new Persona("",0,0);
        this.mail = "";
    }
    
    public Cliente(String unNombre, int unaCedula, int unTelefono, String unMail){
        super.setCedula(unaCedula);
        super.setNombre(unNombre);
        super.setTelefono(unTelefono);
        this.setMail(unMail);
    }
    
    @Override
    public String toString(){
        return 
            "Nombre: " + super.getNombre() + 
            ", CI: " + super.getCedula() + 
            ", Tel: " + super.getTelefono() + 
            ", Mail: " + this.getMail();
    }
    
    public boolean equals(Cliente unCliente){
        boolean ni = this.getNombre().equals(unCliente.getNombre());
        boolean ci = this.getCedula() == unCliente.getCedula();
        boolean ti = this.getTelefono() == unCliente.getTelefono();
        boolean mi = this.getMail().equals(unCliente.getMail());
        
        return (ni && ci && ti && mi);
    }
    
}
