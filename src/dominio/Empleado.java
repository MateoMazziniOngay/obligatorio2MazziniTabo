package dominio;

import java.io.Serializable;


public class Empleado extends Persona implements Serializable{
    
    private String direccion;
    private int anioIngreso;
    
    public Empleado(){
        Persona persona = new Persona("",0,0);
        this.direccion = "";
        this.anioIngreso = 0;
    }
    
    public Empleado(String unNombre, int unaCedula, int unTelefono, String unaDireccion, int unAnio){
        super.setNombre(unNombre);
        super.setCedula(unaCedula);
        super.setTelefono(unTelefono);
        this.setDireccion(unaDireccion);
        this.setAnioIngreso(unAnio);
    }
    
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
    
    public String noNum(String num1, String num2, String num3, String num4){
        
        String noNum = "Deben ingresarse NÚMEROS MAYORES A 0 en los siguientes campos: ";
        boolean hayInvalido = false;
        String args[]  = {num1,num2,num3,num4};
        String ids[] = {"cedula ","anio ", "telefono ","número"};
        
        for(int i = 0; i < 4; i ++){
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
    
     @Override
    public String toString(){
        return "Empleado: " + super.getNombre() + ", CI: " + super.getCedula() + ", Telefono: " + super.getTelefono() + ", Dirección: " + this.getDireccion() + ", Año de ingreso: " + this.getAnioIngreso();
    }
}
