/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controlador.IngresoController;
import modelo.Pelicula;
import modelo.Persona;
import vista.JFInterfaz;

/**
 *
 * @author Kelvin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula();
        Persona persona = new Persona();
        JFInterfaz vista = new JFInterfaz();
        IngresoController ingreso = new IngresoController(vista, persona, pelicula);
        ingreso.iniciar();
        vista.setVisible(true);
    }
    
}
