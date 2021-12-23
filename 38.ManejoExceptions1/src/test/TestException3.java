
package test;

import arimetica.Arimetica2;

/**
 *
 * @author Josh
 */
public class TestException3 {

    public static void main(String[] args) {

        int resultado = 0;

        resultado = Arimetica2.division(10, 0);

        System.out.println("Resultado = " + resultado);
    }
}
