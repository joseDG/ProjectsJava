/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cmc.poo.services.implementar;

import com.cmc.poo.entity.Alimento;
import com.cmc.poo.entity.Cliente;
import com.cmc.poo.services.RestauranteService;

/**
 *
 * @author Josh
 * Clase qeu implementa los metodos de una interfaz
 */
public class RestauranteServiceImpl implements RestauranteService{

    @Override
    public void vender(Alimento alimento, Cliente cliente) {
         double precioAlimento = alimento.getPrecioUnitario();
         double pagoCliente = cliente.getPagoPrecio();
         
         if(pagoCliente < precioAlimento){
             System.err.println("El pago es insuficiente");
         }else if(pagoCliente > precioAlimento){
             System.err.println("Cuidado! Tu pago es mayor");
             
             double cambio = pagoCliente - precioAlimento;
             System.out.println("Cambio a regresar al cliente: " + cambio);
         }else{
             System.out.println("El cliente ha pagado el alimento");
         }
    }
    
}
