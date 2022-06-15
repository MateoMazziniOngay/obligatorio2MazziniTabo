package dominio;

import java.io.Serializable;


public class Visita implements Serializable{
    private Cliente cliente;
    private Empleado empleado;
    private Contrato contrato;
    private Deposito deposito;
    private int mes;
    private int dia;
    
    public Visita(Cliente unCliente, Empleado unEmpleado, Contrato unContrato, Deposito unDeposito, int unDia, int unMes){
       this.setCliente(unCliente);
       this.setEmpleado(unEmpleado);
       this.setContrato(unContrato);
       this.setDia(unDia);
       this.setMes(unMes);
    }
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
    
    public Deposito getDeposito() {
        return deposito;
    }
    public void setDeposito(Deposito unDeposito) {
        this.deposito = unDeposito;
    }
    
    public int getMes() {
        return mes;
    }
    public void setMes(int unMes) {
        this.mes = unMes;
    }
    
    public int getDia() {
        return dia;
    }  
    public void setDia(int unDia) {
        this.dia = unDia;
    }
    
    public boolean validarFecha(int unDia, int unMes){
        boolean valida = true;
        int [] meses31 = {1,3,5,7,8,10,12};
        
        if(!Sistema.contains(meses31,unMes)){
            valida = (mes30(unDia,unMes) || febrero(unDia,unMes));
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
    
    public boolean febrero (int unMes, int unDia){
        boolean ok = false;
        
        if(unMes == 02 && unDia <29){
            ok = true;
        }
        return ok;
    }
}
