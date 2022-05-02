package com.daemontech.sgct.service;

import com.daemontech.sgct.entity.Enfermedad;


import java.util.List;
import java.util.Optional;


public interface EnfermedadService {

    /**
     * Guarda la enfermedad
     *
     * @param enfermedad
     */
    void guardar(Enfermedad enfermedad);


    /**
     * Recupera la lista completa de enfermedads
     *
     * @return
     */
    List<Enfermedad> obtenerTodasLasEnfermedades();


    /**
     * Devuelve la enfermedad correspondiente al id si existe
     *
     * @param id Id de la enfermedad
     * @return
     */
    Optional<Enfermedad> obtenerEnfermedad(Integer id);


    /**
     * Elimina la  enfermedad correspondiente al id
     *
     * @param id Id de la enfermedad
     */
    void eliminar(Integer id);

}
