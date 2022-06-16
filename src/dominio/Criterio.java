package dominio;

import java.util.Comparator;


public class Criterio implements Comparator<Deposito>{

    /* 
    Esta clase contiene el método compare utilizado para
    ordenar los depósitos por su ID. 
    */
    @Override
    public int compare(Deposito d1, Deposito d2){
        return d1.getId()-d2.getId();
    }

}
