package test;

/**
 *
 * @author Josh
 */
public class TestException {

    public static void main(String[] args) {
        int resultado = 0;

        try {
            int resutaltado = 10 / 0;
        } catch (Exception e) {
            System.err.println("Ocurrio un error: ");
            e.printStackTrace();
        }
        System.out.println("Resultado = " + resultado);
    }
}
