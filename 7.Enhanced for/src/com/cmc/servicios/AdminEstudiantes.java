package com.cmc.servicios;

import com.cmc.entidades.Estudiante;
import java.util.ArrayList;

public class AdminEstudiantes {

    private ArrayList<Estudiante> estudiantes;

    public void agregar(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public Estudiante buscar(String cedula) {
        /*Estudiante est = null;
        for (int i = 0; i < estudiantes.size(); i++) {
            est = estudiantes.get(i);*/
        for (Estudiante est : estudiantes) {
            if (cedula.equals(est.getCedula())) {
                return est;
            }
        }
        return null;
    }
    
    public ArrayList<Estudiante> buscarMenor(int edad){
        ArrayList<Estudiante> menores = new ArrayList<Estudiante>();
        for (Estudiante estudiante : estudiantes) {
            if(estudiante.getEdad() < edad){
                menores.add(estudiante);
            }
        }
        return menores;
    }
}
