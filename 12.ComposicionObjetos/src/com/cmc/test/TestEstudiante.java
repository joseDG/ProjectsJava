
package com.cmc.test;

import com.cmc.entidades.Direccion;
import com.cmc.entidades.Estudiante;


public class TestEstudiante {
    public static void main(String[] args) {
        
        Estudiante est = new Estudiante("1105148959", "Jose");
        
        Direccion d1 = new Direccion();
        d1.setCallePrincipal("Guayaquil");
        d1.setCalleSecundaria("Cuenca");
        d1.setNumero("ES40");
        
        est.setDireccion(d1);
        est.imprimir();
    }
    
}
