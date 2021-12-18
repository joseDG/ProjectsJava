package domain;

import java.io.Serializable;

//para que funcione javaBeans se debe agregar Serializable
public class Persona implements Serializable{
   //2. los metodos deben ser private
    private String nombre;
    private String apellido;
    
    //3. debe tener un constructor vacio
    public Persona(){
    }
    
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //4. Deben tener los getter y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
}
