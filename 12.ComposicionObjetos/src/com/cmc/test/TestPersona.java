
package com.cmc.test;

import com.cmc.entidades.Direccion;
import com.cmc.entidades.Persona;

public class TestPersona {
    
    public static void main(String[] args) {
        
        Persona per = new Persona();
        
        System.out.println("Nombre: " + per.getNombre());
        System.out.println("Edad: " + per.getEdad());
        System.out.println("Direccion: " + per.getDireccion());
        
        Direccion dir = per.getDireccion();
        if(dir != null){
            System.out.println("Direccion Principal: " + dir.getCallePrincipal());
        }else{
            System.out.println("La direccion no ha sido asignado");
        }
        
    }
    
}
