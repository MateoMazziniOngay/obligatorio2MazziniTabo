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
    
    // Constructor con parámetros
    public Sistema(){
        this.listaDepositos = new ArrayList();
        this.listaPersonas = new ArrayList();
        this.listaClientes = new ArrayList();
        this.listaEmpleados = new ArrayList();
        this.listaContratos = new ArrayList();
        this.listaVisitas = new ArrayList();
    }
    
    // Getters y Setters de ArrayLists de las clases 
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
    //------------------------------------------------//

    // Métodos
    /*
    Recorre la lista de personas, comparando las cédulas de 
    cada Persona con la recibida para saber si ya existe
    */
    public boolean cedulaExistente(int unaCedula){
        boolean existe = false;
        for(Persona persona : listaPersonas){
            if(persona.getCedula() == unaCedula){
                existe = true;
            }   
        }
        return existe;
    }
    
    /*
    Recorre la lista de depositos, comparando las ID's de 
    cada Deposito con la recibida para saber si ya existe
    */
    public boolean idExistente(int unaId){
        boolean existe = false;
        for(Deposito deposito : listaDepositos){
            if(deposito.getId() == unaId){
                existe = true;
            }   
        }
        return existe;
    }
    
    /*
    Recorre la lista de depositos, comparando las ID's de 
    cada Deposito con la recibida para encontrarlo y devolverlo
    */
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
    
    public ArrayList listaAlquilados(){
        ArrayList <Deposito> depoA = new ArrayList();
        
        for(Contrato contrato : this.getListaContratos()){
            depoA.add(contrato.getDeposito());
        }
        return depoA;
    }
    
    public ArrayList listaDisponibles(){
        ArrayList <Deposito> depoD = new ArrayList();
        
        for(Deposito depo : this.getListaDepositos()){
            if(!listaAlquilados().contains(depo)){
                depoD.add(depo);
            }
        }
        return depoD;
    }
    
    public ArrayList listaSpecs(String spec, ArrayList<Deposito> depos){
        ArrayList<Deposito> deposSpec = new ArrayList();
        for(Deposito depo : depos){
            
            String depoR = depo.getRefrigeracion();
            String depoE = depo.getEstantes();
            
            if((depoR + depoE).equals(spec)){
                deposSpec.add(depo);
            }
        }
        return deposSpec;
    }

    public ArrayList refriSpec(String spec, ArrayList<Deposito> depos){
        ArrayList<Deposito> deposRS = new ArrayList();
        for(Deposito depo : depos){
            
            if(depo.getRefrigeracion().equals(spec)){
                deposRS.add(depo);
            }
        }
        return deposRS;
    }
    
    public ArrayList estSpec(String spec, ArrayList<Deposito> depos){
        ArrayList<Deposito> deposES = new ArrayList();
        for(Deposito depo : depos){
            
            if(depo.getRefrigeracion().equals(spec)){
                deposES.add(depo);
            }
        }
        return deposES;
    }
    
    public ArrayList visitasContrato(Contrato unContrato){
        ArrayList<Visita> visitas = new ArrayList();
        
        for(Visita visita : this.getListaVisitas()){
            if(visita.getContrato().equals(unContrato)){
                visitas.add(visita);
            }
        }
        return visitas;
    }
}
