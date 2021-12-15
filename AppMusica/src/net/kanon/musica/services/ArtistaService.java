/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package net.kanon.musica.services;

import net.kanon.musica.entity.Artista;

/**
 *
 * @author Josh
 * Interface que proporciona el servicio (contratos), para por id un artista.
 */
public interface ArtistaService {
    /**
     *Permite consultar un artista por el id seleccionado por el usuario
     *@param idArtista  - Identificador del artista
     *@return artista consultado
     */
    
    Artista consultarPorId(int idArtista);
}
