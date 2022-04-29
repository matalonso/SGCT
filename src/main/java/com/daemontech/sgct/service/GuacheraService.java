package com.daemontech.sgct.service;

import com.daemontech.sgct.entity.Guachera;

import java.util.List;
import java.util.Optional;


public interface GuacheraService {

    /**
     * Guarda la guachera
     *
     * @param guachera
     */
    void guardar(Guachera guachera);


    /**
     * Recupera la lista completa de guacheras
     *
     * @return
     */
    List<Guachera> obtenerTodasLasGuacheras();


    /**
     * Devuelve la guachera correspondiente al id si existe
     *
     * @param id Id de la guachera
     * @return
     */
    Optional<Guachera> obtenerGuachera(Integer id);


    /**
     * Elimina la  guachera correspondiente al id
     *
     * @param id Id de la guachera
     */
    void eliminar(Integer id);

}
