package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema implements Serializable{
    
    static Scanner teclado = new Scanner(System.in);
    private ArrayList <Deposito> listaDepositos;
    private ArrayList <Persona> listaPersonas;
    private ArrayList <Cliente> listaClientes;
    private ArrayList <Empleado> listaEmpleados;
    private ArrayList <Contrato> listaContratos;
    private ArrayList <Visita> listaVisitas;
    
    public Sistema(){
        this.listaDepositos = new ArrayList();
        this.listaPersonas = new ArrayList();
        this.listaClientes = new ArrayList();
        this.listaEmpleados = new ArrayList();
        this.listaContratos = new ArrayList();
        this.listaVisitas = new ArrayList();
    }
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

    /*Recorre la lista de personas, comparando las cédulas de 
    cada Persona con la recibida para saber si ya existe*/
    public boolean cedulaExistente(int unaCedula){
        boolean existe = false;
        for(Persona persona : listaPersonas){
            if(persona.getCedula() == unaCedula){
                existe = true;
            }   
        }
        return existe;
    }
    
    /*Recorre la lista de depositos, comparando las ID's de 
    cada Deposito con la recibida para saber si ya existe*/
    public boolean idExistente(int unaId){
        boolean existe = false;
        for(Deposito deposito : listaDepositos){
            if(deposito.getId() == unaId){
                existe = true;
            }   
        }
        return existe;
    }
    /*Recorre la lista de depositos, comparando las ID's de 
    cada Deposito con la recibida para encontrarlo y devolverlo*/
    public Deposito buscarId(int unaId){
        Deposito ret = new Deposito();
        for(Deposito deposito : listaDepositos){
            if(deposito.getId() == unaId){
                ret = deposito;
            }   
        }
        return ret;
    }
    
    public static boolean contains(int [] arr, int elem){
        boolean esta = false;
        
        for(int i = 0; i < arr.length && !esta; i++){
            if(arr[i] == elem){
                esta = true;
            }
        }
        return esta;
    }

}
