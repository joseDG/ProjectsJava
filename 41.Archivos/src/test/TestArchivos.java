
package test;

import archivos.ManejoArchivos;
import static archivos.ManejoArchivos.crearArchivo;

/**
 *
 * @author Josh
 */
public class TestArchivos {
    public static void main(String[] args) {
        
        String nombreArchivo = "E:\\Prueba.txt";
        crearArchivo(nombreArchivo);
    }
}
