package dominio;

import java.io.Serializable;


public class Contrato implements Serializable{
    private Cliente cliente;
    private Empleado empleado;
    private Deposito deposito;
    private int numContrato;
    
    
    //Constructor sin parámetros de la clase Contrato
    public Contrato(){
        this.cliente = null;
        this.empleado = null;
        this.deposito = null;
        this.numContrato = 0;
    }
    
    //Constructor con parámetros de la clase Contrato
    public Contrato(Cliente unCliente, Empleado unEmpleado, Deposito unDeposito, int unNumContrato){
        this.setCliente(unCliente);
        this.setEmpleado(unEmpleado);
        this.setDeposito(unDeposito);
        this.setNumContrato(unNumContrato);
    }
    
    // Getters y Setters de Cliente 
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

    public Deposito getDeposito() {
        return deposito;
    }
    
    public void setDeposito(Deposito unDeposito) {
        this.deposito = unDeposito;
    }

    public int getNumContrato() {
        return numContrato;
    }
    
    public void setNumContrato(int unNumContrato) {
        this.numContrato = unNumContrato;
    }
    
    //------------------------------------------------//
    
    // Métodos
    
    //toString() de Contrato.
    public String toString(){
        return 
            "Cliente: " + this.getCliente().getNombre() + 
            " - " + this.getCliente().getCedula()  +
                
            "\n" + "Empleado: " + this.getEmpleado().getNombre() + 
            " - " + this.getEmpleado().getCedula()  + 
                
            "\n" + "Deposito: " + this.getDeposito().getId() + 
            "\n" + "Número de Contrato: " + this.getNumContrato();
    }
    
    //---------------------------------------------//
}
