
package modelo.comparator;

import java.util.Comparator;
import modelo.Pelicula;

/**
 *
 * @author KelvinOjeda
 */
public class comparatorCalificacion implements Comparator<Pelicula>{

    @Override
    public int compare(Pelicula o1, Pelicula o2) {
        return Double.compare(o2.getCalificacion(),o1.getCalificacion());
    }

    
    
}
