
package com.ec.ejercicios;

import java.io.File;
import java.io.IOException;

/**
 *Checked = Toxica
 *Unchecked = Bacile 
 */
public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        
        File file = new File("archivo.txt");
        file.createNewFile();
    }
}
