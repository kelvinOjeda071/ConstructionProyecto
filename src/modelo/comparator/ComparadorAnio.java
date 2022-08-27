
package modelo.comparator;

import java.util.Comparator;
import modelo.Pelicula;

/**
 *
 * @author KelvinOjeda
 */
public class ComparadorAnio implements Comparator<Pelicula>{

    

    @Override
    public int compare(Pelicula o1, Pelicula o2) {
        return (o1.getAnio()-o2.getAnio());
    }
    
}
