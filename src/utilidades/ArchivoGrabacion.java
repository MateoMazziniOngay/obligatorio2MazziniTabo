// Martín Tabó 227665 - Mateo Mazzini 219372

package utilidades;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class ArchivoGrabacion {
    
    private Formatter out;
    
    public ArchivoGrabacion(String unNombre){
        try {
            out = new Formatter(unNombre);
        } catch (FileNotFoundException e) {
            System.out.println("Error: no se puede crear");
            System.exit(1);
        }
    }
    
    public void grabarLinea(String linea){
        out.format("%s%n", linea);
    }
    
    public void cerrar() {
        out.close();
    }
}

