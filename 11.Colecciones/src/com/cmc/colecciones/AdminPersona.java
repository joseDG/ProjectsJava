
package com.cmc.colecciones;

import com.cmc.entidades.Persona;
import java.util.ArrayList;


public class AdminPersona {
    
    private ArrayList<Persona> personas;

    
    //En esta parte podemos arregalr un error
    //que mencioan que el array es null
    public AdminPersona() {
        personas = new ArrayList<Persona>();
    }
    
   
    public void agregar(Persona persona){
        personas.add(persona);
    }
    
    public void imprimir(){
        Persona per = null;
        for (int i = 0; i < personas.size(); i++) {
            per = personas.get(i);
            System.out.println("Nombre" + per.getNombre()+ "Edad:" + per.getEdad());
        }
    }
    
    //Retorna la persona si el nombre coincide
    //caso contrario retonro null
    public Persona buscar(String nombre){
        Persona per;
        for (int i = 0; i < personas.size(); i++) {
            per = personas.get(i);
            if(per.getNombre().equals(nombre)){ //Siempre se compara con equals cuando es tipoClase
                return per;
            }
        }
        //Llega a este piunto solo sono encontreo retorno nulll
        return null;
    }
    
     public Persona buscarPorEdad(int edad){
        Persona per;
        for (int i = 0; i < personas.size(); i++) {
            per = personas.get(i);
            if(per.getEdad() == edad){ //Siempre se compara con equals cuando es tipoClase
                return per;
            }
        }
        //Llega a este piunto solo sono encontreo retorno nulll
        return null;
    }
     
     public ArrayList<Persona> buscarMayores(int edad){
         ArrayList<Persona> personasMayores = new ArrayList<Persona>();
         Persona p;
         for (int i = 0; i < personas.size(); i++) {
             p=personas.get(i);
             if(p.getEdad() > edad){
                 personasMayores.add(p);
             }
         }
         
         return personasMayores;
     }
    
}
