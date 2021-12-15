
package com.ec.ejercicios;

import java.io.File;
import java.io.IOException;

public class Ejercicio3 {

    //Esta forma permite tratar la excepcion.
    public void metodo1() {
        File file = new File("archivo.txt");
        try{
            file.createNewFile();
        }catch(Exception e){
            
        }
    }
    
    //Esta forma el mismo metodo toma la excepcion
    public void metodo2() throws IOException {
        File file = new File("archivo.txt");
        file.createNewFile();
    }
    
    public void metodo3() throws IOException{
        metodo2();
    }
}
