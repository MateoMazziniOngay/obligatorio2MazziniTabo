package dominio;

import java.io.Serializable;


public class Deposito implements Serializable{
    private int id;
    private int tamanio;
    private String estantes;
    private String refrigeracion;
    
    public Deposito(){
        
        this.id = 0;
        this.tamanio = 0;
        this.estantes = "";
        this.refrigeracion = "";
        
    }
    
    public Deposito(int unId, int unTamanio, String estantes, String refri){
        
        this.setId(unId);
        this.setTamanio(unTamanio);
        this.setEstantes(estantes);
        this.setRefrigeracion(refri);
        
    }
    
    public int getId() {
        return id;
    }
    public void setId(int unId) {
        this.id = unId;
    }
    
    public int getTamanio() {
        return tamanio;
    }
    public void setTamanio(int unTamanio) {
        this.tamanio = unTamanio;
    }
    
    public String tieneEstantes() {
        return estantes;
    }
    public void setEstantes(String estantes) {
        this.estantes = estantes;
    }
    
    public String tieneRefrigeracion() {
        return refrigeracion;
    }
    public void setRefrigeracion(String refrigeracion) {
        this.refrigeracion = refrigeracion;
    }
    
    public String pasarSN(String sn){
        if(sn.equals("SI")){
            sn = "S";
        }
        else{
            sn = "N";
        }
        return sn;
    }
    
    public String toString(){
        return 
            "ID: " + this.getId() + 
            ", Tamaño: " + this.getTamanio() + 
            ", Estantes: " + this.tieneEstantes() + 
            ", Refrigeración: " + this.tieneRefrigeracion();
    }
}
