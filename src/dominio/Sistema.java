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
        System.out.println("LOS CLIENTES SON:");
        for(Cliente cliente : listaClientes){
        System.out.println(cliente.getNombre());
        }
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
    
    public static boolean esNum(String num){
        
        try {  
            Integer.parseInt(num);  
            return true;
        }catch(NumberFormatException e){  
            return false;  
        }  
    }
    
    
    // TO DO - PASAR METODO A LA CLASE PERSONA
    public boolean cedulaExistente(int cedula){
        boolean existe = false;
        for(Persona persona : listaPersonas){
            if(persona.getCedula() == cedula){
                existe = true;
            }   
        }
        return existe;
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
