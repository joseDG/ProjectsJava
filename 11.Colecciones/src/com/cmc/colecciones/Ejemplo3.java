
package com.cmc.colecciones;

import com.cmc.entidades.Persona;
import java.util.ArrayList;


public class Ejemplo3 {
    public static void main(String[] args) {
        
        ArrayList<String> lista = new ArrayList<String>();
        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
        
        lista.add("xxx");
        listaPersonas.add(new Persona("Ana", 12));
        
        String a = lista.get(0);
        Persona p=listaPersonas.get(0);
    }
}
