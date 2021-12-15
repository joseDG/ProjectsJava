
package com.cmc.test;

import com.cmc.estaticos.Contador;


public class TestContador {
    public static void main(String[] args) {
        
        Contador contador = new Contador("Objeto1");
        contador.incrementar();
        contador.imprimir();
        
        Contador contador2 = new Contador("Objeto2");
        contador2.incrementar();
        contador2.imprimir();
    }
 
}
