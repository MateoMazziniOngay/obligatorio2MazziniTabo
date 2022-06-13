package ejecutar;
import interfaz.*;
import dominio.Sistema;

public class Ejecutar {
    
    // Creamos la instancia estatica de sistema en esta clase para que se inicie cada vez que se ejecute el programa y asi poder usarla 
    // desde todas las clases.
    public static Sistema sistemaGen = new Sistema();
    static ventanaInicio vent = new ventanaInicio();
    
    public static void main(final String[] args) {
        vent.setVisible(true);
        
    }
}
