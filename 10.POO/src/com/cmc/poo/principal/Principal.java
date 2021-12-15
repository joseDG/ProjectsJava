/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cmc.poo.principal;

import com.cmc.poo.entity.Alimento;
import com.cmc.poo.entity.Cliente;
import com.cmc.poo.entity.Restaurante;
import com.cmc.poo.entity.Sucursal;
import com.cmc.poo.services.implementar.RestauranteServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Josh
 */
public class Principal {
    public static void main(String[] args) {
        
        //TipoObjeto nombreObjeto = new TipoObjeto()
        Restaurante restauranteTacos = new Restaurante();
        
        //Asignacion de valores con el metodo SET
        restauranteTacos.setId(1000L);
        restauranteTacos.setNombre("Tacos Guadalajara");
        restauranteTacos.setImagen("tacosgdl.png");
        restauranteTacos.setSlogan("Lo mas sabroso");
        restauranteTacos.setEstatus(false);
        restauranteTacos.setPais("MEXICO");
        
        
        System.out.println("ID: " + restauranteTacos.getId());
        System.out.println("NOMBRE: " + restauranteTacos.getNombre());
        System.out.println("IMAGEN: " + restauranteTacos.getImagen());
        System.out.println("SLOGAN: " + restauranteTacos.getSlogan());
        System.out.println("TIPO MONEDA: " + restauranteTacos.getTipoMoneda());
        System.out.println("PAIS: " + restauranteTacos.getPais());
        
        String status = restauranteTacos.isEstatus() ? "HABILITADO" : "DESHABILITADO";
        System.out.println("ESTATUS: " + status);
        
        System.out.println("\n");
        //=========Creacion de otro restaurante==============
        Restaurante restauranteChilaquiles = new Restaurante();
        
        //Asignacion de valores con el metodo SET
        restauranteChilaquiles.setId(2000L);
        restauranteChilaquiles.setNombre("Chilaquiles CDMX");
        restauranteChilaquiles.setImagen("chilaquiles.png");
        restauranteChilaquiles.setSlogan("Lo mas picosos");
        restauranteChilaquiles.setEstatus(true);
        restauranteChilaquiles.setPais("Mexico");
        
        System.out.println("ID: " + restauranteChilaquiles.getId());
        System.out.println("NOMBRE: " + restauranteChilaquiles.getNombre());
        System.out.println("IMAGEN: " + restauranteChilaquiles.getImagen());
        System.out.println("SLOGAN: " + restauranteChilaquiles.getSlogan());
        System.out.println("TIPO MONEDA: " + restauranteChilaquiles.getTipoMoneda());
        System.out.println("PAIS: " + restauranteChilaquiles.getPais());
        
        String statusChilaquiles = restauranteChilaquiles.isEstatus() ? "HABILITADO" : "DESHABILITADO";
        System.out.println("ESTATUS: " + statusChilaquiles);
        
        System.out.println(restauranteChilaquiles.getId());
        System.out.println(restauranteTacos.getId());
        
         System.out.println("\n");
        //:::::::::::::::::::::SOBRECARGA:::::::::::::::::::::::::::::::
        Restaurante restauranteItaliano = new Restaurante("EUR", "ITALIANO");
        restauranteItaliano.setNombre("Restaurante de Pizzas Giorno");
        
        System.out.println("NOMBRE: " + restauranteItaliano.getNombre());
        System.out.println("TIPO MONEDA: " + restauranteItaliano.getTipoMoneda());
        System.out.println("PAIS: " + restauranteItaliano.getPais());
        
         System.out.println("\n");
        //:::::::::::::::::::::Ceracion Sucursal:::::::::::::::::::::::::::::::
        Sucursal sucursalPizzaGiorno = new Sucursal();
        sucursalPizzaGiorno.setId(3000);
        sucursalPizzaGiorno.setNombre("Pizzas Giorno - Milan");
        sucursalPizzaGiorno.setGerente("Diego Paqui Lopez");
        
        List<Sucursal> sucursalesRestauranteItaliano = new ArrayList<Sucursal>();
        sucursalesRestauranteItaliano.add(sucursalPizzaGiorno);
        
        restauranteItaliano.setSucursales(sucursalesRestauranteItaliano);
        
        for (Sucursal sucursale : restauranteItaliano.getSucursales()) {
            System.out.println("Sucursales: " + sucursale.getNombre());
        }
        
     
        
        //:::::::::::::::::::::FUNCIONALIDAD DE VENTA DE ALIMENTO:::::::::::::::::::::::::::::::
        Alimento alimentoItaliano = new Alimento();
        alimentoItaliano.setId(1010L);
        alimentoItaliano.setNombre("Pizza Peperoni");
        alimentoItaliano.setPrecioUnitario(200.00);
        
        //Asiganamos el alimento al restaurante
        List<Alimento> alimentoRestauranteItaliano = new ArrayList<Alimento>();
        alimentoRestauranteItaliano.add(alimentoItaliano);
        
        Scanner leerValorTeclado = new Scanner(System.in);
        System.out.println("El total a pagar del alimento " + restauranteItaliano.getAlimentos().get(0).getNombre() + "es de $"+ restauranteItaliano.getAlimentos().get(0).getPrecioUnitario());
        
        double cantidadPagarCliente = leerValorTeclado.nextDouble();
        
        Cliente cliente = new Cliente();
        cliente.setNombre("Michael Jordan");
        
        System.out.println("La cantidad pagada del cliente es de; " + cantidadPagarCliente);
        cliente.setPagoPrecio(cantidadPagarCliente);
        
        //Añadiendo la invocacion al metodo vender.
        RestauranteServiceImpl restauranteServiceImpl = new RestauranteServiceImpl();
        restauranteServiceImpl.vender(restauranteItaliano.getAlimentos().get(0), cliente);

         //:::::::::::::::::::::ARREGLOS:::::::::::::::::::::::::::::::
        int[] arrayNumeros = new int[] {1,2,3,4};
        
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.println("Valor matriz: " + arrayNumeros[i]);
        }
        
        //:::::::::::::::::::::ARRYLIST:::::::::::::::::::::::::::::::
        ArrayList<String> listaCadenas = new ArrayList<String>();
        listaCadenas.add("Texto1");
        listaCadenas.add("Texto2");
        
        for (int i = 0; i < listaCadenas.size(); i++) {
            System.out.println("Valor lista" + listaCadenas.get(i));
        }
        
        //IMplementar el forech
        for (String valor : listaCadenas) {
            System.out.println("Valor Foreach: " + valor);
        }
    }
}
