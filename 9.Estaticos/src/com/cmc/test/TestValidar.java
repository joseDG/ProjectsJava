
package com.cmc.test;

import com.cmc.estaticos.Util;


public class TestValidar {
    public static void main(String[] args) {
        
        Util util = new Util();
        boolean resultado = util.validarRango(5);
        System.out.println(resultado);
        
        
        //invocar un metodo estatico
        resultado = Util.validarPositivo(8);
        System.out.println(resultado);
        
        //Metos estaticos de la clase Math -> random()
        double d = Math.random();
        System.out.println(d);
        
        //Metods estaticos de la clase Integer -> parseint
        int valor = Integer.parseInt("32");
        System.out.println(valor);
    }
}
