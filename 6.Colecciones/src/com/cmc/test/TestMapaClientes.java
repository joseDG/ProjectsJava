
package com.cmc.test;

import com.cmc.entidades.Cliente;
import java.util.HashMap;


public class TestMapaClientes {
    public static void main(String[] args) {
        
        HashMap<String,Cliente> mapa = new HashMap<String,Cliente>();
        
        mapa.put("123123", new Cliente("123123", "Ramiro"));
        mapa.put("345255", new Cliente("345255", "Teresa"));
        
        Cliente c = mapa.get("345255");
        System.out.println(c);
    }
}
