// Martín Tabó 227665 - Mateo Mazzini 219372

package dominio;

import java.io.Serializable;

public class Visita implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Cliente cliente;
    private Empleado empleado;
    private Contrato contrato;
    private String mes;
    private String dia;
    
    // Constructor sin parámetros
    public Visita(){
        this.cliente = null;
        this.empleado = null;
        this.contrato = null;
        this.mes = "0";
        this.dia = "0";
    }
    
    // Constructor con parámetros
    public Visita(Cliente unCliente, Empleado unEmpleado, Contrato unContrato, String unDia, String unMes){
       this.setCliente(unCliente);
       this.setEmpleado(unEmpleado);
       this.setContrato(unContrato);
       this.setDia(unDia);
       this.setMes(unMes);
    }
    
    // Getters y Setters
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente unCliente) {
        this.cliente = unCliente;
    }
    
    public Empleado getEmpleado() {
        return empleado;
    }
    
    public void setEmpleado(Empleado unEmpleado) {
        this.empleado = unEmpleado;
    }
    
    public Contrato getContrato() {
        return contrato;
    }
    
    public void setContrato(Contrato unContrato) {
        this.contrato = unContrato;
    }
    
    public String getMes() {
        return mes;
    }
    
    public void setMes(String unMes) {
        this.mes = unMes;
    }
    
    public String getDia() {
        return dia;
    } 
    
    public void setDia(String unDia) {
        this.dia = unDia;
    }
    
    //------------------------------//
    
    // Métodos 
    //Devuelve un String que contiene el mes y el día.
    public String getFecha(){
        return this.getMes() + this.getDia();
    }
    /*
    Si el mes recibido pertenece a la lista de meses31, retorna true.
    Si no pertenece, se fija que la fecha sea válida para meses de 30 días, o para febrero.
    */
    public boolean validarFecha(int unMes, int unDia){
        boolean valida = true;
        int [] meses31 = {1,3,5,7,8,10,12};
        
        if(!Sistema.contains(meses31,unMes)){
            valida = (mes30(unMes,unDia) || febrero(unMes,unDia));
        }
        return valida;
    }
    
    public boolean mes30 (int unMes, int unDia){
        boolean ok = false;
        int [] meses30 = {4,6,9,11};
        
        if(Sistema.contains(meses30,unMes) && unDia < 31){
                ok = true;
        }
        return ok; 
    }
    
    /*
    Método orientado al mes Febrero de un año no bisiesto. 
    Para años bisiestos se debe cambiar el condicional "<29" de la estructura if() por "<=29".
    */
    public boolean febrero (int unMes, int unDia){
        boolean ok = false;
        
        if(unMes == 02 && unDia <29){
            ok = true;
        }
        return ok;
    }

    //---------------------------------------------//
}
