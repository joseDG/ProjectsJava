
package com.ec.ejercicios;


public class Cuenta {
    private double saldo;
    
    public void depositar(double monto) throws CheckendException{
        if(monto < 0){
            throw new CheckendException("monto incorrecto");
        }
    }
    
    public void retirar(double monto){
        if(monto < 0){
            throw new UnCheckendException("monto es incorrecto");
        }
    }
}
