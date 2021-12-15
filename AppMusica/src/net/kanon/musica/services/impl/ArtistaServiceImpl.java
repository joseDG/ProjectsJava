/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.kanon.musica.services.impl;

import java.util.ArrayList;
import net.kanon.musica.entity.Album;
import net.kanon.musica.entity.Artista;
import net.kanon.musica.services.ArtistaService;

/**
 *
 * @author Josh Clase que implementa los servicios y contratos de ArtistaService
 * para realizar la logica de negocio de la aplicacion
 */
public class ArtistaServiceImpl implements ArtistaService {

    @Override
    public Artista consultarPorId(int idArtista) {

        Artista artista = new Artista();
        ArrayList<Album> albums = new ArrayList<Album>();

        if (idArtista == 1) {
            // ============= MUSE ====================

            //Creamos al artista con sus datos
            artista.setId(1);
            artista.setNombre("Muse");
            artista.setPais("Gran Bretaña");
            artista.setTipoArtista("Grupo");

            Album albumSimulation = new Album();
            albumSimulation.setId(2);
            albumSimulation.setNombre("Simulation Theory");
            albumSimulation.setAnio(2018);
            albumSimulation.setCopiasVendidas(900000);

            Album albumDrones = new Album();
            albumDrones.setId(1);
            albumDrones.setNombre("Drones");
            albumDrones.setAnio(2015);
            albumDrones.setCopiasVendidas(15000000);

            //Agregando cada album a la lista de albums del artista.
            albums.add(albumSimulation);
            albums.add(albumDrones);

            //Agregando la lista de albums ya con el contenido al artista
            artista.setAlbums(albums);
        } else if (idArtista == 2) {
            // ============= METALLICA ====================
            // Creando al artista con sus datos.
            artista.setId(2);
            artista.setNombre("Metallica");
            artista.setPais("Estados Unidos");
            artista.setTipoArtista("Grupo");

            Album albumSimulation = new Album();
            albumSimulation.setId(3);
            albumSimulation.setNombre("Master of Puppets");
            albumSimulation.setAnio(1986);
            albumSimulation.setCopiasVendidas(100000000);

            Album albumDrones = new Album();
            albumDrones.setId(4);
            albumDrones.setNombre("Hardwired...to Self-Destruct");
            albumDrones.setAnio(2016);
            albumDrones.setCopiasVendidas(800000000);

            // Agregando cada album a la lista de albums del artista.
            albums.add(albumSimulation);
            albums.add(albumDrones);

            // Agregando la lista de albums ya con el contenido al artista.
            artista.setAlbums(albums);

        }
        
        return artista;
    }

}
