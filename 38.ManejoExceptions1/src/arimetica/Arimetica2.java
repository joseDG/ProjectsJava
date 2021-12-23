/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arimetica;

import exceptions.OperacionException2;

/**
 *
 * @author Josh
 */
public class Arimetica2 {
    public static int division(int numerador, int denominador) {
        if (denominador == 0){
            throw new OperacionException2("Division entre cero");
        }
        
        return numerador / denominador;
    }
}
