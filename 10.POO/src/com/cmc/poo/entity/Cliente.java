package com.cmc.poo.entity;

/**
 *
 * @author Josh
 */
public class Cliente {
    private long id;
    private String nombre;
    private double pagoPrecio;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPagoPrecio() {
        return pagoPrecio;
    }

    public void setPagoPrecio(double pagoPrecio) {
        this.pagoPrecio = pagoPrecio;
    }
    
    
}
