/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yo.horizontes;

/**
 *
 * @author delli
 */
public class Persona implements Comparable<Persona>{
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.id = (nombre.length() + (int)( Math.random()*20+1));
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = (this.nombre.length() + (int) Math.random()*20+1);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public int compareTo(Persona per) {
        if (this.id < per.getId()) {
            return -1;
        }
        else if (this.id > per.getId()) {
            return 1;
        }
        return 0;
    }
}
