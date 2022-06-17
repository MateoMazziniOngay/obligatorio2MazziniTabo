package dominio;

import java.util.Comparator;

public class CriterioVisita implements Comparator<Visita>{
    /* 
    Esta clase contiene el método compare utilizado para
    ordenar las visitas por su Fecha. 
    */
    @Override
    public int compare(Visita v1, Visita v2){
        return Integer.parseInt(v1.getFecha()) - Integer.parseInt(v2.getFecha());
    }
}
