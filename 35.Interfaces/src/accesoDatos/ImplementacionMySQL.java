
package accesoDatos;

/**
 *
 * @author Josh
 */
public class ImplementacionMySQL implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar desde My SQL");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MySQL");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde MYSQL");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde MYSQL");
    }
    
    
}
