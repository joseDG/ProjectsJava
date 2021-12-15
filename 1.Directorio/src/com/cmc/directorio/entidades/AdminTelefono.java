
package com.cmc.directorio.entidades;


public class AdminTelefono {
    
    
    public Telefono activarMensajeria(Telefono telefono){ 
        if(telefono.getOperadora() == "movi"){
            telefono.setTieneWhatsapp(true);
        }
        return null;
    }
    
    public Telefono contarMovi(Telefono telf1, Telefono telf2, Telefono telf3){
        if(telf1.getOperadora() == "movi"){
            System.out.println("Este pertenece a operadora " + telf1.getOperadora());
        }else if (telf2.getOperadora() == "movi"){
            System.out.println("Este pertenece a operadora " + telf2.getOperadora());
        }else if(telf3.getOperadora() == "claro"){
            System.out.println("Este pertenece a operadora " + telf3.getOperadora());
        }else{
            System.out.println("No pertenece ala operadora MOVI");
        }
        
        return null;
    }
    
}
