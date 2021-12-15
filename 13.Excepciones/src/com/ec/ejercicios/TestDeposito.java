/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ec.ejercicios;


public class TestDeposito {
    public static void main(String[] args){
        
        Cuenta c = new Cuenta();
        try{
           c.depositar(-100); 
        }catch (CheckendException e){
            //se logue es decir siempre va stackTrace
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
        
        System.out.println("Fin");
        
    }
}
