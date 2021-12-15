
package com.cmc.test;

import com.cmc.estaticos.DiasSemana;
//Se crea el import 
import static java.lang.Math.PI;

public class TestDiasSemanas {
    public static void main(String[] args) {
        
        DiasSemana ds = new DiasSemana();
        int valor = ds.MARTES;
        System.out.println(valor);
        
        valor = DiasSemana.MIERCOLES;
        System.out.println(valor);
        
        //aqui se llama de forma mas reducido al mometo de llamar
        double d1 = PI;
        System.out.println(d1);
    }
 
}
