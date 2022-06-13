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
    
    public String isEstantes() {
        return estantes;
    }
    public void setEstantes(String estantes) {
        this.estantes = estantes;
    }
    
    public String isRefrigeracion() {
        return refrigeracion;
    }
    public void setRefrigeracion(String refrigeracion) {
        this.refrigeracion = refrigeracion;
    }
    
    public String noNum(String num1, String num2){
        
        String noNum = "Deben ingresarse NÚMEROS MAYORES A 0 en los siguientes campos: ";
        boolean hayInvalido = false;
        String args[]  = {num1,num2};
        String ids[] = {"ID ","Tamaño"};
        
        for(int i = 0; i < 2; i ++){
            boolean valido = Sistema.esNum(args[i]);
            
            if(!valido){
                hayInvalido = true;
                noNum += ids[i];
            }else{
                int number = Integer.parseInt(args[i]);
                if(number < 1){
                    hayInvalido = true;
                    noNum += ids [i];
                }
            }
            
        } 
        if(hayInvalido){
           return noNum; 
        }
        else{
            return "";
        }   
    }
}
