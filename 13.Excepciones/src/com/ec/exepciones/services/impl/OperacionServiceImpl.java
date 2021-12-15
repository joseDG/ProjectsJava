/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ec.exepciones.services.impl;

import com.ec.exepciones.services.OperacionesService;
import java.sql.SQLException;

/**
 *
 * @author Josh Clase qeu implementa los metodo de la interfaz OperacionService
 * para explicar el tema de excepciones.
 */
public class OperacionServiceImpl implements OperacionesService {

    /**
     *
     * @param numerador
     * @param denominador
     * @return
     * @throws ArithmeticException
     */
    //@Override
//    public double dividir(double numerador, double denominador) throws ArithmeticException {
//        double resultado = numerador / denominador;
//        System.out.println(resultado);
//        return resultado;
//    }

    
//    public double dividir(double numerador, double denominador) throws ArithmeticException {
//        double resultado = numerador / denominador;
//        System.out.println(resultado);
//        
//        if(resultado != Double.POSITIVE_INFINITY){
//            return resultado;
//        }else{
//            throw new ArithmeticException();
//        }
//        
//    }
    
/**
 * Metodo sobre cargado de ejemplo para explicar las excepciones UNCHECKED.
 * @param numerador
 * @param denominador
 * @return
 * @throws NullPointerException
**/    
    
    public double dividir(Double numerador, Double denominador) {
        double resultado = 0.0;

        if (denominador != null && numerador != null) {
            resultado = numerador / denominador;
        } else {
            throw new NullPointerException();
        }
        
        System.out.println(resultado);
        return resultado;
    }

    @Override
    public double dividir(double numerador, double denominador) throws ArithmeticException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /*
    *Metodo sobreacargado de ejemplo para explicar las excepiones CHECKED.
    @param numerador paramero con el numerador.
    @param denominador parametro con el denominador
    @retunr resultado de la division
    @throws SQLException
    */
    public double dividir (String numerador, String denominador)throws SQLException{
        throw  new SQLException();
    }
}
