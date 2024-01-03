/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Handler;
import Datos.Producto;
/**
 *
 * @author delli
 */
public class Handler {
    public boolean create(String nombre, String tipo, int cantidad) {
        Producto p = new Producto();
        return p.createProduct(nombre, tipo, cantidad);
    }
    
    public String search(String nombre){
        Producto p = new Producto();
        return p.searchProduct(nombre);
    }
    
    public boolean mod(String nombre, String newNombre, String newTipo, int newCantidad){
        Producto p = new Producto();
        return p.modProduct(nombre, newNombre, newTipo, newCantidad);
    }
}
