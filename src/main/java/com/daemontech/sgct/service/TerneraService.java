package com.daemontech.sgct.service;

import java.util.List;
import java.util.Optional;

import com.daemontech.sgct.entity.Ternera;


public interface TerneraService {

    /**
     * Guarda la ternera
     *
     * @param ternera
     */
    void guardar(Ternera ternera);


    /**
     * Recupera la lista completa de terneras
     *
     * @return
     */
    List<Ternera> obtenerTodasLasTerneras();


    /**
     * Devuelve la ternera correspondiente al id si existe
     *
     * @param id Id de la ternera
     * @return
     */
    Optional<Ternera> obtenerTernera(Integer id);


    /**
     * Elimina la  ternera correspondiente al id
     *
     * @param id Id de la ternera
     */
    void eliminar(Integer id);

}
