/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.conexion;

import java.util.ArrayList;

/**
 *
 * @author Kelvin
 */
public interface ConsultaBDD<T> {
    
    public boolean create(T instancia);
    
    public boolean update(T instancia);
    
    public boolean delete(T instancia);
    
    public T getById(int i);
    
    public ArrayList<T> getList();
    
}
