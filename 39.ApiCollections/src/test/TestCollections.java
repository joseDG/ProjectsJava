
package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Josh
 */
public class TestCollections {
    public static void main(String[] args) {
        //Las list se demoran mas
        //Dipkicar los elementos
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        imprimir(miLista);
        
//        for (Object elemento : miLista) {
//            System.out.println("Elemento = " + elemento);
//        }

        miLista.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
        
        //no guarda un orden por lo cuale s mas rapido
        //no se duplican elementos
         Set miSet = new HashSet();
         miSet.add("Lunes");
         miSet.add("Martes");
         miSet.add("Miercoles");
         miSet.add("Jueves");
         miSet.add("Viernes");
         
         Map miMapa = new HashMap();
         miMapa.put("valor1", "Juan");
         miMapa.put("valor2", "Karla");
         miMapa.put("valor3", "Rosario");
         
         String elemento = (String) miMapa.get("valor1");
         //System.out.println("elemtno = " + elemento);
         
         imprimir(miMapa.keySet());
         imprimir(miMapa.values());
         
    }
    
    public static void imprimir(Collection colection){
        for (Object elemento : colection) {
            System.out.println("Elemento" + elemento);
        }
    } 
    
   
}
