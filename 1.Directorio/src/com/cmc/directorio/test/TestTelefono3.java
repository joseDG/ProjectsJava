
package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;


public class TestTelefono3 {
    public static void main(String[] args) {
        
        Telefono telf1 = new Telefono("movi","098234243",20);
        Telefono telf2 = new Telefono("movi","098234243",10);
        Telefono telf3 = new Telefono("claro","098234243",30);
        
        AdminTelefono at = new AdminTelefono();
        
        Telefono contarMovi = at.contarMovi(telf1, telf2, telf3);
         if(contarMovi != null){
             System.out.println(contarMovi.getOperadora());
         }else{
             System.out.println("Pertence ala Operadora Claro");
         }
       
        
        
    }
}
