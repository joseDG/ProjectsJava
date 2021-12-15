/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ec.ejercicios;

/**
 *
 * @author Josh
 */
public class TestCuentas {
    public static void main(String[] args) {
        
        Cuenta c = new Cuenta();
        try{
            c.retirar(-100);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
