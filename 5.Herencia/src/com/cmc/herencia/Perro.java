
package com.cmc.herencia;


/*Notas:
    - Para que exista la sobre escritura es necesario la herencia.
    - El metodo sobre escrinto debe tener igual al metodo original.
*/
public class Perro extends Animal{
    
    public void ladrar(){
        System.out.println("Perro Ladra");
    }
    
    @Override
    public void dormir(){
        //con super puede acceder alos metodos del padre
        super.dormir();
        System.out.println("Perrro Durmiendo");
    }
    
    
}
