
package test;

public class TestArgumentoVariables {
    public static void main(String[] args) {
        imprimirNumeros(3,4,5);
        imprimirNumeros(1,2);
        variosParametros("juan", 9,6,10);

    }
    
     private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
     
    //Argumnetos variables        
    //Es cuando se va pasar un argumento a un metodo
    //Esto es similar a un arreglo 
    //la diferencia con un arreglo es que no se necesita decir el numero de elementos
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento:" + numeros[i]);
        }
    }
    
   
}
