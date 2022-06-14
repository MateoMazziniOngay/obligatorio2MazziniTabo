package dominio;

import java.io.Serializable;


public class Contrato implements Serializable{
    private Cliente cliente;
    private Empleado empleado;
    private Deposito deposito;
    private int numContrato;
    
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
    public String toString(){
        return 
            "Cliente: " + this.getCliente() + 
            ", Empleado: " + this.getEmpleado() + 
            ", Deposito: " + this.getDeposito() + 
            ", Número de Contrato: " + this.getNumContrato();
    }
}
