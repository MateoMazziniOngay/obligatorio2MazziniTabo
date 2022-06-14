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
        // Persona persona = new Persona(unNombre,unaCedula,unTelefono);
        super.setCedula(unaCedula);
        super.setNombre(unNombre);
        super.setTelefono(unTelefono);
        this.setMail(unMail);
    }
    
    public String vacios(String arg1, String arg2, String arg3, String arg4){
        
        String vacios = "Debe completar los siguientes campos: ";
        boolean hayVacios = false;
        String args[]  = {arg1,arg2,arg3,arg4};
        String ids[] = {"nombre ","cedula ","mail ","telefono"};
        
        for(int i = 0; i < 4; i ++){
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
    
    public String noNum(String num1, String num2){
        
        String noNum = "Deben ingresarse NÚMEROS MAYORES A 0 en los siguientes campos: ";
        boolean hayInvalido = false;
        String args[]  = {num1,num2};
        String ids[] = {"cedula ","telefono"};
        
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

    @Override
    public String toString(){
        return "Cliente: " + super.getNombre() + ", CI: " + super.getCedula() + ", Telefono: " + super.getTelefono() + ", Mail: " + this.getMail();
    }
    
}
