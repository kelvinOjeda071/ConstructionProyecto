/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.conexion;

/**
 *
 * @author Kelvin
 */
public class JDBCDAOFactory extends DAOFactory{

    public JDBCConsultaPeliculaBDD getConsultaPeliculaBDD() {
       return new JDBCConsultaPeliculaBDD();
    }

    public JDBCConsultaPersonaBDD getConsultaPersonaBDD() {
        return new JDBCConsultaPersonaBDD();
    }
    
}
