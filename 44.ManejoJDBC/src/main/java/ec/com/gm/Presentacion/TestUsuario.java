/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.com.gm.Presentacion;

import ec.com.gm.datos.UsuarioDAO;
import ec.com.gm.entidades.Usuario;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Josh
 */
public class TestUsuario {
    public static void main(String[] args) throws SQLException {
        
        UsuarioDAO usuarioJdbc = new UsuarioDAO();
        
        //Ejecutando el listado de usuarios
        List<Usuario> usuarios = usuarioJdbc.select();
        for(Usuario usuario: usuarios){
            System.out.println("Usuario:" + usuario);
        }
        
        //Insertamos un nuevo usuario
//        Usuario usuario = new Usuario("carlos.juarez", "123");
//        usuarioJdbc.insert(usuario);

        //Modificamos un usuario existente
//        Usuario usuario = new Usuario(3, "carlos.juarez","456");
//        usuarioJdbc.update(usuario);

        //usuarioJdbc.delete(new Usuario(2));
    }
}
