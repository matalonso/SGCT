package com.daemontech.sgct.service;

import com.daemontech.sgct.entity.Enfermedad;
import com.daemontech.sgct.entity.Peso;

import java.util.List;
import java.util.Optional;


public interface PesoService {

    /**
     * Guarda el peso
     *
     * @param peso
     */
    void guardar(Peso peso);


    /**
     * Recupera la lista completa de pesos
     *
     * @return
     */
    List<Peso> obtenerTodosLosPesos();


    /**
     * Devuelve la peso correspondiente al id si existe
     *
     * @param id Id del peso
     * @return
     */
    Optional<Peso> obtenerPeso(Integer id);


    /**
     * Elimina el peso correspondiente al id
     *
     * @param id Id del peso
     */

    void eliminar(Integer id);

}
