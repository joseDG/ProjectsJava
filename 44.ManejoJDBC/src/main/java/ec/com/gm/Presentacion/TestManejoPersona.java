/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.com.gm.Presentacion;

import ec.com.gm.datos.PersonaDAO;
import ec.com.gm.entidades.Persona;
import java.util.List;

/**
 *
 * @author Josh
 */
public class TestManejoPersona {
    public static void main(String[] args) {
        
        PersonaDAO personaDao = new PersonaDAO();

        //Insertando un nuevo objeto de tipo Persona
//        Persona personaNueva = new Persona("Carlos", "Esparza", "cesparza@mail.com", "554456587");
//        personaDao.insertar(personaNueva);

        //Modificar un objeto de persona existente
//        Persona personaModificar = new Persona(4, "Juan Carlos", "Esparza", "jcesparza@mail.com", "554456587");
//        personaDao.actualizar(personaModificar);

        //Eliminar un registro
        Persona personaEliminar = new Persona(4);
        personaDao.eliminar(personaEliminar);
        
        //Listado Persona
        List<Persona> personas = personaDao.seleccionar();

        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
    }
}
