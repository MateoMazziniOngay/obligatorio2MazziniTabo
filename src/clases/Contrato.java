package clases;


public class Contrato {
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
}
