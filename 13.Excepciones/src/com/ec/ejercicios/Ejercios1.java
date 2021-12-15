
package com.ec.ejercicios;


public class Ejercios1 {
    public static void main(String[] args) {
        
        System.out.println("Inicio");
        
        try{
            String a = null;
            a.substring(1,3);
            System.out.println("luego del substring");
        }catch(Exception e){
            System.out.println("Entra al catch");
        }finally{
            System.out.println("Entra al finally");
        }
        System.out.println("fin");
    }
}
