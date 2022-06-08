package clases;


public class Visita {
    private Cliente cliente;
    private Empleado empleado;
    private Contrato contrato;
    private Deposito deposito;
    private int mes;
    private int dia;
    
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
}
