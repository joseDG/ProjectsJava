
package mx.com.gm.ventas.test;

import mx.com.gm.ventas.Orden;
import mx.com.gm.ventas.Producto;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50.00);
        Producto producto2 = new Producto("Pantalon", 70.00);
        Producto producto3 = new Producto("Gorra", 30.00);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        
        System.out.println("\n");
        
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto3);
        orden2.mostrarOrden();
    }
}
