/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.Comparator;


public class Criterio implements Comparator<Deposito>{

    @Override
    public int compare(Deposito d1, Deposito d2){
        return d1.getId()-d2.getId();
    }

}
