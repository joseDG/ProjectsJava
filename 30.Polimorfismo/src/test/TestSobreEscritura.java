/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Empleado;
import domain.Gerente;

/**
 *
 * @author Josh
 */
public class TestSobreEscritura {
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Juan", 5000);
       //System.out.println("empleado = " + empleado.obtenerDetalles());
       imprimir(empleado);

       empleado = new Gerente("Karla", 10000, "Contabilidad");
       //System.out.println("gerente = " + gerente.obtenerDetalles());
       imprimir(empleado);
    }
    
     public static void imprimir(Empleado empleado){
        String detalles = empleado.obtenerDetalles();
        System.out.println("empleado = " + detalles);
    }
}
