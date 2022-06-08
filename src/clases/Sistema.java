package clases;

import java.util.ArrayList;

public class Sistema {
    ArrayList <Deposito> listaDepositos = new ArrayList <Deposito> ();
    ArrayList <Persona> listaPersonas = new ArrayList <Persona> ();
    ArrayList <Cliente> listaClientes = new ArrayList <Cliente> ();
    ArrayList <Empleado> listaEmpleados = new ArrayList <Empleado> ();
    ArrayList <Contrato> listaContratos = new ArrayList <Contrato> ();
    ArrayList <Visita> listaVisitas = new ArrayList <Visita> ();
    
    public ArrayList<Deposito> getListaDepositos() {
        return listaDepositos;
    }
    
    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }
    
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
    
    public ArrayList<Contrato> getListaContratos() {
        return listaContratos;
    }
   
    public ArrayList<Visita> getListaVisitas() {
        return listaVisitas;
    } 

    public void agregarDeposito(Deposito unDeposito) {
        listaDepositos.add(unDeposito);
    }

    public void agregarPersona(Persona unaPersona) {
        listaPersonas.add(unaPersona);
    }

    public void agregarCliente(Cliente unCliente) {
        listaClientes.add(unCliente);
    }

    public void agregarEmpleado(Empleado unEmpleado) {
        listaEmpleados.add(unEmpleado);
    }

    public void agregarContrato(Contrato unContrato) {
        listaContratos.add(unContrato);
    }

    public void agregarVisita(Visita unaVisita) {
        listaVisitas.add(unaVisita);
    }
}
