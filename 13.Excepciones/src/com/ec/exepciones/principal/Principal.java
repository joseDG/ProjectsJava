package com.ec.exepciones.principal;

import com.ec.exepciones.services.impl.OperacionServiceImpl;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Principal {
    public static void main(String[] args) {
        
        int primerNumero = 5;
        int segundoNumero = 0;
        
        double resultado = 0.0;
        
        try {
            resultado = primerNumero / segundoNumero;
        } catch (ArithmeticException e) {
            //e.printStackTrace(); como el programador puede identificar el error
            System.err.println("Error ocasionado por una division entre 0"); // mensaje para el cliente
        }finally{
            System.out.println("Entrando a finaly");   
        }
       
        System.out.println("Resultado" + resultado);
        
        //:::::::::::::::::::CAPTURANDO EXCEPCION CON TRY-CATCH LANZADA CON THROWS:::::::::
         OperacionServiceImpl opreacionesServiceImpl = new OperacionServiceImpl();
         
         try {
            double resultadoDivision = opreacionesServiceImpl.dividir(10.0, 0.0);
             System.out.println("Resultado de la division: " + resultadoDivision);
             double resultadoDivisionCadena = opreacionesServiceImpl.dividir("5.0", "10.0");
        } catch (ArithmeticException e) {
             System.out.println("Hubo un problema en la division en metodo con throws: " + e.getMessage());
        }catch(NullPointerException e){
            e.printStackTrace();
             System.out.println("UNo de los valores no se asino a ña opreacion: "+ e.getMessage());
        } catch (SQLException ex) {
            ex.printStackTrace();
             System.out.println("Hubo un problema al obtener los valores a ocupar desde la base de datos: " + ex.getMessage());
        }
    }
}
