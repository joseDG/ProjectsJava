
package com.cmc.test.arreglos;

import com.cmc.arreglos.entidades.Contacto;


public class TestContactos {
    public static void main(String[] args) {
        
        Contacto [] contactos = new Contacto[5];
        contactos[0] = new Contacto("123", "Juan");
        contactos[1] = new Contacto("123", "Andres");
        
        //Contacto c = contactos[4];
        //System.out.println(c);
        
        Contacto contacto=null;
        for (int i = 0; i < contactos.length; i++) {
             contacto = contactos[i];
             System.out.println(contacto);
        }
        
    }
}
