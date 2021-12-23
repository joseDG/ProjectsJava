package test;

/**
 *
 * @author Josh
 */
public class TestException4 {
    public static void main(String[] args) {
        
         int resultado = 0;

        try {
            resultado = 10 / 0;
        } catch (Exception e) {
            System.err.println("Ocurrio un error: ");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally{
            System.out.println("Se reviso la division entre cero");
        }
        System.out.println("Resultado = " + resultado);
    }
    
}