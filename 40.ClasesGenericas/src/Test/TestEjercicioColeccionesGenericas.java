
package Test;

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
public class TestEjercicioColeccionesGenericas {
    public static void main(String[] args) {
        
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        String elemento = miLista.get(0);
        System.out.println("elemento = " + elemento);
        
        //imprimir(miLista);
        
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");
        imprimir(miSet);
        
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");
        miMapa.put("valor3", "Carlos");
        
        String elementoMapa = miMapa.get("valor3");
//        System.out.println("elementoMapa = " + elementoMapa);
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    
    public static void imprimir(Collection<String> coleccion){
        coleccion.forEach(elemento -> {
            System.out.println("elemento  = " + elemento);
        });
        
        for(String elemento: coleccion){
            System.out.println("elemento = " + elemento);
        }
    }
}
