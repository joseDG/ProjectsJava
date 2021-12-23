
package com.cmc.test;

import com.cmc.colecciones.AdminPersona;
import com.cmc.entidades.Persona;
import java.util.ArrayList;


public class TestAdmin {
    public static void main(String[] args) {
        
        AdminPersona admin = new AdminPersona();
        
        admin.agregar(new Persona("Jose", 10));
        admin.agregar(new Persona("Andres", 8));
        admin.agregar(new Persona("Elisa", 28));
        
        //admin.imprimir();
        
        Persona personaBuscada = admin.buscar("Jose");
        if (personaBuscada==null){
            System.out.println("Persona: No existe");
        }else{
             System.out.println("Persona Encontrada: " +personaBuscada.getNombre());
        }
        
        ArrayList<Persona> ps = admin.buscarMayores(11);
        System.out.println(ps.size());
       
    }
}
