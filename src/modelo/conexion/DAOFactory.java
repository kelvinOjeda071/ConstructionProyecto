/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.conexion;

/**
 *
 * @author Kelvin
 */
public abstract class DAOFactory {
    protected static DAOFactory instancia = new JDBCDAOFactory();
    
    public static DAOFactory getFactory(){
        return instancia;
    }
    
    public abstract JDBCConsultaPeliculaBDD getConsultaPeliculaBDD();
    public abstract JDBCConsultaPersonaBDD getConsultaPersonaBDD();
    
    
}
