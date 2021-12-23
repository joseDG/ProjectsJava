/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import arimetica.Arimetica;

/**
 *
 * @author Josh
 */
public class TestException2 {
    public static void main(String[] args) {
        
        int resultado = 0;

        try {
            resultado = Arimetica.division(10, 0);
        } catch (Exception e) {
            System.err.println("Ocurrio un error: ");
            System.out.println(e.getMessage());
        }
        System.out.println("Resultado = " + resultado);
    }
}
