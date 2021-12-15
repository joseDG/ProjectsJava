
package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;


public class TestTelefono2 {
    public static void main(String[] args) {
        
        Telefono telf = new Telefono("movi","098234243",20);
        
        AdminTelefono at = new AdminTelefono();
        
        Telefono activarMensajeria = at.activarMensajeria(telf);
        
        System.out.println(telf.getOperadora());
        System.out.println(telf.getNumero());
        System.out.println(telf.getCodigo());
        System.out.println(telf.isTieneWhatsapp());
    }
}
