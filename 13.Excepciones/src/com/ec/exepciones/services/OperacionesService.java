/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ec.exepciones.services;

/**
 *
 * @author Josh
 * Interfaz qeu proporciona lois emtodo de ocntrato para realizar operaciones ariemticas y explique
 * la funcionaloidad de las palabras throws y thrown
 */
public interface OperacionesService {
    
    //se recomienda que los metods se hablen en infinitivo
    double dividir(double numerador, double denominador) throws ArithmeticException;
    
}
