/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.conexion;

import java.util.ArrayList;
import modelo.Pelicula;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Kelvin
 */
public class JDBCConsultaPeliculaBDD implements ConsultaPeliculaBDD {

    @Override
    public boolean create(Pelicula instancia) {
        boolean ingreso = false;
        String sql = "insert into pelicula ( nombre, anio, calificacion, genero, estado) values (?,?,?,?,?)";
        PreparedStatement pstm = null;
        try {
            pstm = ConexionBDD.getConexion().prepareStatement(sql);
            pstm.setString(1, instancia.getNombre());
            pstm.setInt(2, instancia.getAnio());
            pstm.setFloat(3, instancia.getCalificacion());
            pstm.setString(4, instancia.getGenero());
            pstm.setString(5, instancia.getEstado());
            int filasIngresadas = pstm.executeUpdate();
            System.out.println("Filas insertadas en persona: " + filasIngresadas);
            ingreso = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConexionBDD.cerrar(pstm);
        }
        return ingreso;

    }

    @Override
    public boolean update(Pelicula instancia) {
        boolean actualizado = false;
        String sql = "update pelicula set nombre = ?, anio=?, calificacion=?, genero=?, estado=? where id = ?";
        PreparedStatement pstm = null;
        try {
            pstm = ConexionBDD.getConexion().prepareStatement(sql);
            pstm.setString(1, instancia.getNombre());
            pstm.setInt(2, instancia.getAnio());
            pstm.setFloat(3, instancia.getCalificacion());
            pstm.setString(4, instancia.getGenero());
            pstm.setString(5, instancia.getEstado());
            pstm.setInt(6, instancia.getId_pelicula());
            int filasIngresadas = pstm.executeUpdate();
            System.out.println("Filas actualizadas en persona: " + filasIngresadas);
            actualizado = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConexionBDD.cerrar(pstm);
        }
        return actualizado;
    }

    @Override
    public boolean delete(Pelicula instancia) {
        boolean eliminado = false;
        String sql = "delete from pelicula where id= ?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            pstm = ConexionBDD.getConexion().prepareStatement(sql);
            pstm.setInt(1, instancia.getId_pelicula());
            int filasIngresadas = pstm.executeUpdate();
            System.out.println("Filas eliminadas en persona: " + filasIngresadas);
            eliminado = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConexionBDD.cerrar(pstm);
        }
        return eliminado;

    }

    @Override
    public Pelicula getById(int i) {
        String sql = "select * from pelicula where id = ?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Pelicula pelicula = null;
        try {
            pstm = ConexionBDD.getConexion().prepareStatement(sql);
            pstm.setInt(1, i);
            rs = pstm.executeQuery();
            while (rs.next()) {
                pelicula = new Pelicula(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6));
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            ConexionBDD.cerrar(pstm);
            ConexionBDD.cerrar(rs);
        }
        return pelicula;

    }

    @Override
    public ArrayList<Pelicula> getList() {
        String sql = "select * from pelicula";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
        try {
            pstm = ConexionBDD.getConexion().prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                listaPeliculas.add(new Pelicula(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6)));
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            ConexionBDD.cerrar(pstm);
            ConexionBDD.cerrar(rs);
        }
        return listaPeliculas;
    }

}
