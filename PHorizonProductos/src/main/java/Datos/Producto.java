/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author delli
 */
public class Producto {
    public String nombre;
    public String tipo;
    public int cantidad;

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    
    public boolean createProduct(String nombre, String tipo, int cantidad){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productos",
                    "root", "123456789");
            String consulta = "INSERT INTO producto (nombre,tipo,cantidad) values(?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(consulta);
            statement.setString(1, nombre);
            statement.setString(2, tipo);
            statement.setInt(3, cantidad);
            int fil = statement.executeUpdate();
            
            if (fil>0)
                return true;
            else
                return false;
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    public String searchProduct(String nombre){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Productos",
                    "root", "123456789");
            String consulta = "Select * from producto where nombre=?";
            PreparedStatement statement = con.prepareStatement(consulta);
            statement.setString(1, nombre);
            ResultSet rs = statement.executeQuery();
            if (rs.next()){
                String snombre = rs.getString("nombre");
                String stipo = rs.getString("tipo");
                int scantidad = rs.getInt("cantidad");
                
                return (snombre + " " + stipo + " " + scantidad);
            }
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("Error: " + e.getMessage());
            return null;
        }
        return null;
    }
    
    public boolean modProduct(String nombre, String newNombre, String newTipo, int newCantidad){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Productos",
                    "root", "123456789");
            String consulta = "UPDATE producto set nombre=?, tipo=?, cantidad=? where nombre=?";
            PreparedStatement statement = con.prepareStatement(consulta);
            statement.setString(1, newNombre);
            statement.setString(2, newTipo);
            statement.setInt(3, newCantidad);
            statement.setString(4, nombre);
            int fil = statement.executeUpdate();
            
            if (fil>0)
                return true;
            else
                return false;
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}
