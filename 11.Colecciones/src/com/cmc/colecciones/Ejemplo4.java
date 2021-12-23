
package com.cmc.colecciones;

import com.cmc.entidades.Persona;
import java.util.ArrayList;


public class Ejemplo4 {
    public static void main(String[] args) {
        
        ArrayList<Persona> personas = new ArrayList<Persona>();
        
        personas.add(new Persona("Hulk", 30));
        personas.add(new Persona("Spiderman", 29));
        personas.add(new Persona("Max", 30));
        
        System.out.println(personas.size());
        
        
        Persona per = null;
        for(int i=0;i<personas.size(); i++){
            per=personas.get(i);
            System.out.println(per.getNombre()+ "-" + per.getEdad());
        }
    }
}
