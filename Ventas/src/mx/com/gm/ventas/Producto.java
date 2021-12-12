
package mx.com.gm.ventas;

/**
 *
 * @author Josh
 */
public class Producto {
    private final int idProducto; //variable estatica y se la puede llamar directamente 
    private String nombre;
    private double precio;
    private static int contadorProductos;

    //solo se puede utilizar en esta clase
    private Producto() {
        this.idProducto = ++Producto.contadorProductos;
    }

    public Producto(String nombre, double precio) {
        this(); //se llama al costructor privado que tiene como para metro idProducto
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
     
}
