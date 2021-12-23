
package com.cmc.colecciones;

import java.util.ArrayList;


public class Ejemplo2 {
    public static void main(String[] args) {
        
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("a");
        lista.add("b");
        lista.add("c");
        
        String recuperado = lista.get(0);
        
        System.out.println("valor:" + recuperado);
        
        int tamanio = lista.size();
        System.out.println("tamanio: "+tamanio);
        
        String cadena=null;
        for(int i=0; i<lista.size(); i++){
            cadena = lista.get(i);
            System.out.println("Valor: " + cadena);
        }
    }
}
