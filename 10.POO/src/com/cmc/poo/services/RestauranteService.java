/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cmc.poo.services;

import com.cmc.poo.entity.Alimento;
import com.cmc.poo.entity.Cliente;

/**
 * Toda interfaz tiene metodos publicos.
 * Todos metodos son abstractos.
 * Puede o no regresar un tipo de dato.
 * No tiene cuerpo 
 * Las interfaces se definen metodos seran proporcionados como funciones minimas a cumplir.
 * @author Josh
 */
public interface RestauranteService {
    
    //Los metodos de una interfaz pueden ser public y abstract.
    public abstract void vender(Alimento alimento, Cliente cliente);
}
