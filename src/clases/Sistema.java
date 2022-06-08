package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    
    static Scanner teclado = new Scanner(System.in);
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
    
    public static int validarNum(String num){
        boolean valido = esNum(num);
        
        while(!valido || (valido && Integer.parseInt(num) < 1)){
            
            System.out.println("El valor ingresado debe ser un NÚMERO mayor a 0");
            num = teclado.nextLine();
            valido = esNum(num);
            
        }
        
        int newNum = Integer.parseInt(num);
        
        return newNum;
    }
    
    public static boolean esNum(String num){
        
        try {  
            Integer.parseInt(num);  
            return true;
        }catch(NumberFormatException e){  
            return false;  
        }
        
    }
}
