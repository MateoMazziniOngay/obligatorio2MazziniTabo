// Martín Tabó 227665 - Mateo Mazzini 219372

package ejecutar;

import interfaz.*;
import dominio.Sistema;
import utilidades.Serializacion;

public class Ejecutar {
    
    /*
    Creamos la instancia estática de sistema en esta clase para 
    que se inicie cada vez que se ejecute el programa, y así poder usarla 
    desde todas las clases.
    */
    public static Sistema sistemaGen = new Sistema();
       
    public static void main(final String[] args) {
        inicioPrograma vent = new inicioPrograma(sistemaGen);
        vent.setVisible(true);
        
    }
}
