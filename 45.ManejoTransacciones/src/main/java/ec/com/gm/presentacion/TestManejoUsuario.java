/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.com.gm.presentacion;

import ec.com.gm.datos.Conexion;
import ec.com.gm.datos.UsuarioDAO;
import ec.com.gm.entidades.Usuario;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Josh
 */
public class TestManejoUsuario {
    public static void main(String[] args) {
         
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            UsuarioDAO usuarioJdbc = new UsuarioDAO(conexion);

            Usuario cambioUsuario = new Usuario();
            cambioUsuario.setId_usuario(1);
            cambioUsuario.setUsername("juan.perez.1");
            cambioUsuario.setPassword("123");
            usuarioJdbc.update(cambioUsuario);

            Usuario nuevoUsuario = new Usuario();
            nuevoUsuario.setUsername("carlos.ramirez");
            nuevoUsuario.setPassword("12311111111111111111111111111111111111111111111111");
            //nuevoUsuario.setPassword("123");
            usuarioJdbc.insert(nuevoUsuario);

            conexion.commit();
            System.out.println("Se ha hecho commit de la transaccion");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }
}
