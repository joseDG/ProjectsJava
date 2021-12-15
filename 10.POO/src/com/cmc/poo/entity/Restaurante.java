
package com.cmc.poo.entity;

import java.util.List;


public class Restaurante extends Edificio{
    
   
    private String tipoMoneda;
    private String pais;
    private List<Sucursal> sucursales;
    private List<Alimento> alimentos;

   
    
    //Constructor sirve para generar objetos
    public Restaurante() {
        System.out.println("Creando objeto de moneda asignado default");
        this.tipoMoneda = "Peso Mexicano (MXN)";    
    }

    /*
    *Sobrecarga de Constructor
    *1. Se debe respetar la estructura del metodo o constructor a sobrecargar.
    *2. El meotodo sobrecargado debe tener mas parametros que le metodo o constructor original.
    *3. El metodo sobrecargado si tiene la misma cantidad de parametros que el metodo original y otros sobrecargados
    * debe tener diferentes tipo de datos
    *@param tipoMoneda parametro con el tipo de moneda asignado pro el usuario
    */
    public Restaurante(String tipoMoneda) {
        System.out.println("Creando objeto desde cosntructor sobrecargado");
        this.tipoMoneda = tipoMoneda;
    }
    
     public Restaurante(String tipoMoneda, String pais) {
        this.tipoMoneda = tipoMoneda;
        this.pais = pais;
    }
    
    
    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(List<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public List<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(List<Alimento> alimentos) {
        this.alimentos = alimentos;
    }
    
   
    
    
    
}
