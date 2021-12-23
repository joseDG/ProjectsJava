package ec.com.gm.peliculas.datos;

import ec.com.gm.peliculas.entidades.Pelicula;
import ec.com.gm.peliculas.ex.excepciones.AccesoDatosEx;
import ec.com.gm.peliculas.ex.excepciones.EscrituraDatosEx;
import ec.com.gm.peliculas.ex.excepciones.LecturaDatosEx;
import java.util.List;

/**
 *
 * @author Josh
 */
public interface IAccesoDatos {
    
    boolean existe(String nombreRecurso) throws AccesoDatosEx;
    List<Pelicula> listar (String nombreRecurso) throws LecturaDatosEx;
    
    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;
    
    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;
    
    void crear(String nombreRecurso) throws AccesoDatosEx;

    void borrar(String nombreRecurso) throws AccesoDatosEx;
}
