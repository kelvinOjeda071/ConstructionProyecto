
package modelo;

/**
 *
 * @author KelvinOjeda
 */
public class Pelicula {
    private int id_pelicula;
    private String nombre;
    private int anio;
    private int calificacion;
    private String genero;
    private String estado;

    public Pelicula() {
    }
    

    public Pelicula(int id_pelicula, String nombre, int anio, int calificacion, String genero, String estado) {
        this.id_pelicula = id_pelicula;
        this.nombre = nombre;
        this.anio = anio;
        this.calificacion = calificacion;
        this.genero = genero;
        this.estado = estado;
    }

    public int getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "id_pelicula=" + id_pelicula + ", nombre=" + nombre + ", anio=" + anio + ", calificacion=" + calificacion + ", genero=" + genero + ", estado=" + estado + '}';
    }
    
    
    
    
}
