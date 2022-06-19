// Martín Tabó 227665 - Mateo Mazzini 219372

package dominio;

import java.io.Serializable;

public class Contrato implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
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
    @Override
    public String toString(){
        return 
            "Cliente: " + this.getCliente().getNombre() + 
            " - " + this.getCliente().getCedula()  +
                
            "\n" + "Empleado: " + this.getEmpleado().getNombre() + 
            " - " + this.getEmpleado().getCedula()  + 
                
            "\n" + "Deposito: " + this.getDeposito().getId() + 
            "\n" + "Número de Contrato: " + this.getNumContrato();
    }
    
    
    //equals() de Contrato, nos dice si dos contratos son iguales.
    public boolean equals(Contrato unContrato){
        boolean ci = this.getCliente().equals(unContrato.getCliente());
        boolean ei = this.getEmpleado().equals(unContrato.getEmpleado());
        boolean di = this.getDeposito().getId() == unContrato.getDeposito().getId();
        boolean ni = this.getNumContrato() == unContrato.getNumContrato();
        
        return (ci && ei && di && ni);
    }
    //---------------------------------------------//
}
