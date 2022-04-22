package com.daemontech.sgct.entity;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Nombre_Alimento
 */
@Entity
@Table(name = "NOMBRES_ALIMENTO")
@Data
public class Nombre_Alimento implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nombre_alimento")
    private Integer id_nombre_alimento;

    @Column(name = "nombre_alimento", nullable = false, length = 50, unique = true)
    private String nombre_alimento;


}
