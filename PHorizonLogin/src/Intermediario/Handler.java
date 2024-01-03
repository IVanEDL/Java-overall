/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Intermediario;
import Datos.Usuario;

/**
 *
 * @author delli
 */
public class Handler {
    public boolean login(String user, String passwd){
        Usuario u = new Usuario();
        return user.equals(u.usuario) && passwd.equals(u.contraseña);
    }
}
