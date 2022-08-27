/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelo.conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Pelicula;
import modelo.Persona;

/**
 *
 * @author Kelvin
 */
public class TestConexion {

    public static void main(String[] args) {
        String sql = "select * from pelicula";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
        try {
            pstm = ConexionBDD.getConexion().prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                System.out.println(new Pelicula(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6)));
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            ConexionBDD.cerrar(pstm);
            ConexionBDD.cerrar(rs);
        }
        
    }
    
}
