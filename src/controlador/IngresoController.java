/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Pelicula;
import modelo.Persona;
import modelo.conexion.ConexionBDD;
import modelo.conexion.DAOFactory;
import modelo.estructuraDatos.Cola;
import vista.JFInterfaz;

/**
 *
 * @author Kelvin
 */
public class IngresoController implements  ActionListener{
    private JFInterfaz vista;
    private Persona persona;
    private Pelicula pelicula;
    DefaultTableModel modelo= new DefaultTableModel();
    DefaultTableModel modeloMostrar= new DefaultTableModel();
    Cola cola;

    public IngresoController(JFInterfaz vista, Persona persona, Pelicula pelicula) {
        this.vista = vista;
        this.persona = persona;
        this.pelicula = pelicula;
        this.vista.jBIngresar.addActionListener(this);
    }
    
    public void iniciar(){
        vista.setLocationRelativeTo(null);
        cargarElementosColumna();
        cargarPeliculas(DAOFactory.getFactory().getConsultaPeliculaBDD().getList());
        ArrayList<Pelicula> peliculas = DAOFactory.getFactory().getConsultaPeliculaBDD().getList();
        for (Pelicula p: peliculas){
            System.out.println(p);
        }
        this.vista.jTable.setModel(modelo);
        this.vista.jTMostrar.setModel(modeloMostrar);
    }
    
    public void cargarElementosColumna(){
        
        ArrayList<Object>nombreColumna=new ArrayList <Object>();
        nombreColumna.add("ID-Pelicula");
        nombreColumna.add("Nombre");
        nombreColumna.add("Año");
        nombreColumna.add("Calificación");
        nombreColumna.add("Género");
        nombreColumna.add("Estado");
        for(Object columna: nombreColumna){
            modelo.addColumn(columna);
            modeloMostrar.addColumn(columna);
        }
        
        
    }
    
    public void cargarPeliculas(ArrayList<Pelicula> listaMostar){
        modeloMostrar.setNumRows(0);
        Object [] arrayRow= new Object[6];
        for(Pelicula aux : listaMostar ){
            arrayRow[0]=aux.getId_pelicula();
            arrayRow[1]=aux.getNombre();
            arrayRow[2]=aux.getAnio();
            arrayRow[3]=aux.getCalificacion();
            arrayRow[4]=aux.getGenero();
            arrayRow[5]=aux.getEstado();
           modelo.addRow(arrayRow);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
    
    
}
