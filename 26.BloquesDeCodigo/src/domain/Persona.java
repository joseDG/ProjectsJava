
package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    //Creacion de bloque de inilizacion
    static{
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
    }
    
    {
        System.out.println("Ejecucion bloque NO estatico");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
}
