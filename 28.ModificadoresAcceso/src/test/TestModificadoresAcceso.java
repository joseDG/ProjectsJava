package test;

import paquete1.Clase1;
import paquete2.ClaseHija;

/**
 *
 * @author Josh
 */
public class TestModificadoresAcceso {

    public static void main(String[] args) {

//Llamada Publica        
//        Clase1 clase1 = new Clase1();
//        System.out.println("clase1 = " + clase1.atributoPublico);
//        clase1.metodoPublico();
//Llamada Protegida
//        ClaseHija claseHija = new ClaseHija();
//        System.out.println("claseHija = " + claseHija);
//    }
//    Clase1 clase1 = new Clase1();
//        clase1.atributoDefault = "Cambio desde la prueba";
//        System.out.println("clase1 atributo default = " + clase1.atributoDefault);
//        clase1.metodoDefault();
        Clase1 clase1 = new Clase1("Publico");
        clase1.setAtributoPrivado("cambio valor atributo");
        System.out.println("clase1 = " + clase1.getAtributoPrivado());
    }
}
