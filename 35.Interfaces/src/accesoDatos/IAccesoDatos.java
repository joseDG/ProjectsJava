package accesoDatos;

/**
 * Las interfaces no tienen constructor 
 * solo tienen metodos abstractos
 * es obligatorio asignar un valor al atributo
 * todos los atributos son CONSTANTES
 * Las interfaces se utilzian cuando tienen comportamientos en comun entre las clases
 */
public interface IAccesoDatos {
    int MAX_REGISTRO = 10;
    
    //metodos abstractos
    void insertar();
    
    
    void listar();
    
    
    void actualizar();
    
    
    void eliminar();
}
