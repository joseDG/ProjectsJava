
package mundopc;

import ec.com.mundopc.*;


public class MundoPc {
    public static void main(String[] args) {
        
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("blutooh", "HP");
        Raton ratonHP = new Raton("Blutooh", "HP");
        Computadora computadoraHP =new Computadora("Computadora Hp", monitorHP, tecladoHP, ratonHP);
        
        
        Monitor monitorDell = new Monitor("Dell", 23);
        Teclado tecladoDell = new Teclado("blutooh", "Dell");
        Raton ratonDell = new Raton("Blutooh", "Dell");
        Computadora computadoraDell =new Computadora("Computadora Dell", monitorDell, tecladoHP, ratonDell);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraDell);
        
        orden1.mostrarOrden();
        
        
    }
}
