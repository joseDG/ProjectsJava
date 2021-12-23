
package ec.com.gm.peliculas.logica;

/**
 *
 * @author Josh
 */
public interface ICatalogoPeliculas {
    
    //variable constante
    String NOMBRE_RECURSO = "peliculas.txt";
    
    void agregarPelicula(String nombrePelicula);
    
    void listarPeliculas();
    
    void buscarPelicula(String buscar);
    
    void iniciarCatalogoPeliculas();
}
