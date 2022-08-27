/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.comparator;

import java.util.Comparator;
import modelo.Pelicula;

/**
 *
 * @author KelvinOjeda
 */
public class ComparadorIdPelicula implements Comparator<Pelicula>{

    

    @Override
    public int compare(Pelicula o1, Pelicula o2) {
        return (o1.getId_pelicula()-o2.getId_pelicula());
    }
    
}
