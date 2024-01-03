/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yo.horizontes;

//import java.util.UUID;

/**
 *
 * @author delli
 */
public class Producto {
    private String nombre;
    private String tipo;
    private int stock;
    private int id;
    public static int lastId = 0;

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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    //public String thisId(){
        //UUID uuid = UUID.randomUUID();
        //return uuid.toString();
    //}

    public Producto(String nombre, String tipo, int stock) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.stock = stock;
        this.id = Producto.lastId;
        Producto.lastId++;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", tipo=" + tipo + ", stock=" + stock + '}';
    }
    
    
}
