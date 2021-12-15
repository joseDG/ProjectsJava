
package com.cmc.test;

import com.cmc.entidades.AdminProducto;
import com.cmc.entidades.Producto;


public class TestProducto {
    public static void main(String[] args) {
        
        AdminProducto admin = new AdminProducto();
        
        Producto prod1 = new Producto("papas", 0.50);
        Producto prod2 = new Producto("Cola", 10.2);
        
        Producto prodCaro = admin.obtenerProductoMasCaro(prod1, prod2);
    }
}
