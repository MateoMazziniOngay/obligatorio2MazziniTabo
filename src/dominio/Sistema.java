// Martín Tabó 227665 - Mateo Mazzini 219372

package dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class Sistema implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private ArrayList <Deposito> listaDepositos;
    private ArrayList <Persona> listaPersonas;
    private ArrayList <Cliente> listaClientes;
    private ArrayList <Empleado> listaEmpleados;
    private ArrayList <Contrato> listaContratos;
    private ArrayList <Visita> listaVisitas;
    
    // Constructor
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
    cada Persona con la recibida para saber si se encuentra registrada.
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
    cada Depósito con la recibida para saber si se encuentra registrada.
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
    Recorre la lista de contratos, comparando las ID's de 
    cada Contrato con la recibida para encontrarlo y devolverlo
    */
    public Contrato buscarId(int unaId){
        Contrato ret = new Contrato();
        
        for(Contrato contrato : listaContratos){
            if(contrato.getNumContrato() == unaId){
                ret = contrato;
            }   
        }
        
        return ret;
    }
    
    /*
    Recorre el array recibido en busca de un elemento, 
    si lo encuentra retorna true, de lo contrario, false.
    */
    public static boolean contains(int [] arr, int elem){
        boolean esta = false;
        
        for(int i = 0; i < arr.length && !esta; i++){
            if(arr[i] == elem){
                esta = true;
            }
        }
        return esta;
    }
    
    /*
    Recorre la lista de contratos, añadiendo sus depósitos a una lista para saber 
    cuáles se encuentran alquilados.
    Retorna una lista con los depósitos alquilados.
    */
    public ArrayList listaAlquilados(){
        ArrayList <Deposito> depoA = new ArrayList();
        
        for(Contrato contrato : this.getListaContratos()){
            depoA.add(contrato.getDeposito());
        }
        return depoA;
    }
    
    /*
    Recorre la lista de depositos, preguntando si estos pertenecen a la lista de 
    depositos alquilados, si no pertnecen, los agrega a la lista de disponibles.
    Retorna una lista con los depósitos disponibles.
    */
    public ArrayList listaDisponibles(){
        ArrayList <Deposito> depoD = new ArrayList();
        
        for(Deposito depo : this.getListaDepositos()){
            if(!listaAlquilados().contains(depo)){
                depoD.add(depo);
            }
        }
        return depoD;
    }
    
    /*
    Recorre la lista de visitas, si el contrato de la visita es igual al recibido, 
    lo agrega a la lista. 
    Retorna la lista de visitas de un contrato.
    */
    public ArrayList visitasContrato(Contrato unContrato){
        ArrayList<Visita> visitas = new ArrayList();
        
        for(Visita visita : this.getListaVisitas()){
            if(visita.getContrato().equals(unContrato)){
                visitas.add(visita);
            }
        }
        return visitas;
    }
    
    //Recibe un depósito y busca a qué contrato está asociado contrato
    public Contrato buscarContrato(Deposito unDeposito){
        Contrato unContrato = new Contrato();
        for(Contrato contrato : this.getListaContratos()){
            if(contrato.getDeposito().equals(unDeposito)){
                unContrato = contrato;
            }
        }
        return unContrato;
    }

    //---------------------------------------------//
}
