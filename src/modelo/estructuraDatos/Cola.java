
package modelo.estructuraDatos;

import java.util.Iterator;
import java.util.LinkedList;
import modelo.Pelicula;

/**
 *
 * @author KelvinOjeda
 */
public class Cola {
    
    private LinkedList<Pelicula>cola;
    
    //Constructor que inicializa la cola
    public Cola(){
       this.cola = new LinkedList();
       
    }
    //Metodo que añade elementos a la cola
    public void anadirElementos(Pelicula pelicula){
        this.cola.offer(pelicula);
    }
    //Metodo que elimina el ultimo elemento de la cola
    public void eliminarUltimo(){
        this.cola.poll();
    }
    //Metodo que muestra el primero elemento de la cola
    public Pelicula PrimerElementoCola(){
        return this.cola.peek();
    }
    //Metodo para mostrar todos los elemento de la cola
    @Override
    public String toString(){
        /*
         Como la clase Queue no cuenta con un metodo para iterar dentro de la cola
        se procede a utilizar un metodo de linked list, mismo que sirve para ir
        iterar todos los elementos dentro de la cola
        */
        String salida="";
        Iterator d = cola.iterator();
        while (d.hasNext()){
            salida+=d.next().toString()+"\n\n";
        }
        return salida;
    }
    
    
}
