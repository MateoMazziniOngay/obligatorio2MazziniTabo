// Martín Tabó 227665 - Mateo Mazzini 219372

package utilidades;
import java.io.IOException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import dominio.Sistema;
import java.nio.file.NoSuchFileException;

/* 
La clase de serializacion nos permite serializar los arrays que creamos al instanciar la clase Sistema.
El proceso de la serializacion implica la serializacion para el momento de cerrar el programa, donde se van a guardar los datos, y la deserializacion
para el momento de abrir el programa y obtener los datos guardados en los archivos.
*/

public class Serializacion {
    
    public static void serializar(Sistema sist){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datos.ser"));
            out.writeObject(sist);
            out.close();
        } catch (IOException e) {
            System.out.println("Error de archivo");
            System.exit(1);
        }
    }
    
    public static Sistema deserializar(Sistema sist){
        try {
            ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get("datos.ser")));
            sist = (Sistema) in.readObject();
            in.close();
        } catch(NoSuchFileException e){
            //Si es la primera vez que entra, el archivo no existe así que lo creo
            File archivo = new File("datos.ser");

        }catch (IOException|ClassNotFoundException e) {
            System.out.println("Error de recuperación " + e);
            System.exit(1);

        }
        return sist;
    }


    
}
