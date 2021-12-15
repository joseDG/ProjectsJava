/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.kanon.musica.entity;

/**
 *
 * @author Josh
 */
public class Album {
    private int id;
    private String nombre;
    private int anio;
    private long copiasVendidas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public long getCopiasVendidas() {
        return copiasVendidas;
    }

    public void setCopiasVendidas(long copiasVendidas) {
        this.copiasVendidas = copiasVendidas;
    }
    
    
}
