/**
 *
 */
package net.kanon.musica.principal;

import java.util.Scanner;
import net.kanon.musica.entity.Artista;
import net.kanon.musica.services.impl.ArtistaServiceImpl;

/**
 * @author Diego Paniagua Lopez. Clase Principal que muestra el funcionamiento
 * para agregar albums a un artista.
 */
public class Principal {

    /**
     * Permite ejecutar la aplicacion de Musica
     *
     * @param args
     */
    public static void main(String[] args) {
        iniciarBusqueda();
    }

    public static void iniciarBusqueda() {

        ArtistaServiceImpl artistaServiceImpl = new ArtistaServiceImpl();
        Artista artistaConsultado = null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el número del artista que deseas consultar");

        System.out.println("1 - Muse");
        System.out.println("2 - Metallica");

        int idArtistaSeleccionado = scanner.nextInt();
        scanner.nextLine();

        switch (idArtistaSeleccionado) {

            case 1:
                artistaConsultado = artistaServiceImpl.consultarPorId(idArtistaSeleccionado);
                break;
            case 2:
                artistaConsultado = artistaServiceImpl.consultarPorId(idArtistaSeleccionado);
                break;
            default:
                System.err.println("No se encontraron registros en base a tu selección");
                break;
        }

        if (artistaConsultado != null) {
            System.out.println("======= Registro encontrado ========");
            System.out.println("NOMBRE: " + artistaConsultado.getNombre());
            System.out.println("TIPO DE ARTISTA: " + artistaConsultado.getTipoArtista());
            System.out.println("PAÍS: " + artistaConsultado.getPais());
            System.out.println("ALBUMS: \n");

            artistaConsultado.getAlbums().forEach(album -> {
                System.out.println("\tALBUM: \t" + album.getNombre());
                System.out.println("\tAÑO DE LANZAMIENTO: \t" + album.getAnio());
                System.out.println("\tCOPIAS VENDIDAS: \t" + album.getCopiasVendidas());
                System.out.println();
            });
        }

        System.out.println("¿Deséas realizar otra búsqueda? Y/N");
        String opcionSeleccionada = scanner.nextLine();

        if (opcionSeleccionada.equals("Y")) {
            iniciarBusqueda();
        }

        scanner.close();

        System.out.println("¡Gracias por usar nuestro buscador de artistas, te esperamos pronto!");
        System.exit(0);

    }
}
