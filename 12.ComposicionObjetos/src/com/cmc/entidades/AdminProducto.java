
package com.cmc.entidades;

public class AdminProducto {
    
    public Producto obtenerProductoMasCaro(Producto a, Producto b){
        if (a.getPrecio() > b.getPrecio()){
            return a;
        }else if(b.getPrecio() > a.getPrecio()){
            return b;
        }else{
            return null;
        }
    }
    
}
