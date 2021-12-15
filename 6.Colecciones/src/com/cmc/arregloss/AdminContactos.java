
package com.cmc.arregloss;

import com.cmc.arreglos.entidades.Contacto;


public class AdminContactos {
    private Contacto[] contactos;
    private int elementosAgregados;
    
    public AdminContactos(){
        contactos = new Contacto[10];
    }
    
    public void agregar(Contacto contacto){
        if(elementosAgregados<contactos.length){
            contactos[elementosAgregados] = contacto;
            elementosAgregados = elementosAgregados + 1;
        }
    }
    
    
}
