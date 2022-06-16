/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

