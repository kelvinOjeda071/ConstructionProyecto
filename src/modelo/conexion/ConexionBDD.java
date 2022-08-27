/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kelvin
 */
public class ConexionBDD {

    private static ConexionBDD conexionClass = null;
    private static Connection instancia = null;

    private ConexionBDD() {
        try {
            if (instancia == null) {
                String server = "localhost";
                String database = "tiendapeliculas";
                String url = "jdbc:mysql://" + server + "/" + database;
                String usuario = "root";
                String password = "jme";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                instancia = DriverManager.getConnection(url, usuario, password);
                System.out.println("Conexión realizada");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConexion() {
        if (instancia == null) {
            conexionClass = new ConexionBDD();
        }
        return instancia;
    }

    public static void cerrar(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        rs = null;
    }

    public static void cerrar(PreparedStatement pstm) {
        try {
            pstm.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        pstm = null;
    }

}
