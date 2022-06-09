package dominio;


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
    
    public String vacios(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6){
        
        String vacios = "Debe completar los siguientes campos: ";
        boolean hayVacios = false;
        String args[]  = {arg1,arg2,arg3,arg4,arg5,arg6};
        String ids[] = {"nombre ","cedula ","año de ingreso ","telefono ", "calle ", "número"};
        
        for(int i = 0; i < 6; i ++){
            if(args[i].equals("")){
                hayVacios = true;
                vacios += ids[i];
            }
        }
        if(hayVacios){
           return vacios; 
        }
        else{
            return "";
        }
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
}
