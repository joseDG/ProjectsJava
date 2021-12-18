
package accesoDatos;

/**
 *
 * @author Josh
 */
public class ImplementacionOracle implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertando desde ORACLE");
    }

    @Override
    public void listar() {
        System.out.println("Listando desde Oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualziar desde Oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde oracle");
    }
    
}
