/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arimetica;

import exceptions.OperacionException;

/**
 *
 * @author Josh
 */
public class Arimetica {
    public static int division(int numerador, int denominador) throws OperacionException {
        if (denominador == 0){
            throw new OperacionException("Division entre cero");
        }
        
        return numerador / denominador;
    }
}
