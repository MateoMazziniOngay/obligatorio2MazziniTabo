// Martín Tabó 227665 - Mateo Mazzini 219372

package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;


public class Deposito implements Serializable{
    private int id;
    private int tamanio;
    private String estantes;
    private String refrigeracion;
    
    
    //Constructor sin parámetros de la clase Deposito
    public Deposito(){
        
        this.id = 0;
        this.tamanio = 0;
        this.estantes = "";
        this.refrigeracion = "";
        
    }
    
    //Constructor con parámetros de la clase Deposito
    public Deposito(int unId, int unTamanio, String estantes, String refri){
        
        this.setId(unId);
        this.setTamanio(unTamanio);
        this.setEstantes(estantes);
        this.setRefrigeracion(refri);
        
    }
    
    // Getters y Setters de Deposito 
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
    
    public String getEstantes() {
        return estantes;
    }
    
    public void setEstantes(String estantes) {
        this.estantes = estantes;
    }
    
    public String getRefrigeracion() {
        return refrigeracion;
    }
    
    public void setRefrigeracion(String refrigeracion) {
        this.refrigeracion = refrigeracion;
    }    
    
    //------------------------------------------------//

    // Métodos
    
    //Convierte el "SI" en "S" y el "NO" en "N"
    public String pasarSN(String sn){
        if(sn.equals("SI")){
            sn = "S";
        }
        else{
            sn = "N";
        }
        return sn;
    }
    
    /*
    Recibe las carácteristicas de un depósito: S/N Refrigeración, S/N Estantes
    Recorre el array de depositos, toma el valor de su Refrigeracion y 
    Estantes, los concatena y los compara con el String recibido,
    si son iguales, lo agrega a una lista.
    Retorna una lista con los depósitos que cumplen con el parámetro recibido.
    */
    public ArrayList listaSpecs(String spec, ArrayList<Deposito> depos){
        ArrayList<Deposito> deposSpec = new ArrayList();
        for(Deposito depo : depos){
            
            String depoR = depo.getRefrigeracion();
            String depoE = depo.getEstantes();
            
            if((depoR + depoE).equals(spec)){
                deposSpec.add(depo);
            }
        }
        return deposSpec;
    }

    /*
    Recibe la  Refrigeración de un depósito: S/N.
    Recorre el array de depósitos, toma el valor de su "refrigeracion" lo 
    compara con el String recibido, si son iguales, lo agrega a una lista.
    Retorna una lista con los depósitos que cumplen con el parámetro recibido.
    */
    public ArrayList refriSpec(String spec, ArrayList<Deposito> depos){
        ArrayList<Deposito> deposRS = new ArrayList();
        for(Deposito depo : depos){
            
            if(depo.getRefrigeracion().equals(spec)){
                deposRS.add(depo);
            }
        }
        return deposRS;
    }
    
    /*
    Recibe la  Estántes de un depósito: S/N.
    Recorre el array de depósitos, toma el valor de su "estantes" lo 
    compara con el String recibido, si son iguales, lo agrega a una lista.
    Retorna una lista con los depósitos que cumplen con el parámetro recibido.
    */
    public ArrayList estSpec(String spec, ArrayList<Deposito> depos){
        ArrayList<Deposito> deposES = new ArrayList();
        for(Deposito depo : depos){
            
            if(depo.getRefrigeracion().equals(spec)){
                deposES.add(depo);
            }
        }
        return deposES;
    }
    
    //toString() de Deposito
    public String toString(){
        return 
            "ID: " + this.getId() + 
            ", Tamaño: " + this.getTamanio() + 
            ", Estantes: " + this.getEstantes() + 
            ", Refrigeración: " + this.getRefrigeracion();
    }

    //equals() de Cliente, nos dice si dos clientes son iguales.
    public boolean equals(Deposito unDeposito){
        boolean ii = this.getId() == unDeposito.getId();
        boolean ti = this.getTamanio() == unDeposito.getTamanio();
        boolean ei = this.getEstantes().equals(unDeposito.getEstantes());
        boolean ri = this.getRefrigeracion().equals(unDeposito.getRefrigeracion());
        
        return (ii && ti && ei && ri);
    }
    
    //Ordena los depósitos de manera ascendente de acuerdo a su ID.
    public ArrayList<Deposito> ordenA (ArrayList contratos){
        Collections.sort(contratos, new CriterioDeposito());
        
        return contratos;
    }
    //---------------------------------------------//
}
