package clases;

public class Cliente extends Persona {

    private String mail;

    public String getMail() {
        return mail;
    }

    public void setMail(String unMail) {
        this.mail = unMail;
    }
    
    public String vacios(String arg1, String arg2, String arg3, String arg4){
        
        String vacios = "Debe completar los siguientes campos: ";
        boolean hayVacios = false;
        String args[]  = {arg1,arg2,arg3,arg4};
        String ids[] = {"nombre - ","mail - ","cedula - ","telefono"};
        
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
}
