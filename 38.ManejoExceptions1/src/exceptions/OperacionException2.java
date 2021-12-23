/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author Josh
 * Si se le agregaRunTimeException No obliga a lanzar el error
 * el codigo es mas limpio
 * No obliga alanzar errores
 */
public class OperacionException2 extends  RuntimeException{
    public OperacionException2(String mensaje){
        super(mensaje);
    }
}
