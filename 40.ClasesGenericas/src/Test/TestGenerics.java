
package Test;

import Genericos.ClaseGenerica;

/**
 *
 * @author Josh
 */
public class TestGenerics {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objectInt = new ClaseGenerica(15);
        objectInt.obtenerTipo();
        
        ClaseGenerica<String> objectString = new ClaseGenerica("Juan");
        objectString.obtenerTipo();
    }
}
