
package test;

import domain.FiguraGeometrica;
import domain.Rectangulo;

/**
 *
 * @author Josh
 */
public class test {
    public static void main(String[] args) {
         //FiguraGeometrica figura = new FiguraGeometrica();
        
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
    }
}
