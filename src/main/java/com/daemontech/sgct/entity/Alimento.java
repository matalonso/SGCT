package com.daemontech.sgct.entity;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Alimento
 */
@Entity
@Table(name = "ALIMENTOS")
@Data
public class Alimento implements Serializable {


    private static final long serialVersionUID = 1L;

    public Alimento() {
        super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alimento")
    private Integer id_alimento;

    @JoinColumn(name = "fk_nombre_alimento", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Nombre_Alimento nombreAlimento;

    @Column
    @Enumerated(EnumType.STRING)
    private Enumerados.Unidad_Alimento unidad_alimento;

    @Column(name = "marca_alimento", nullable = false, length = 50, unique = false)
    private String marca_alimento;

    @Column(name = "stock_minimo_alimento",nullable = false, length = 50, unique = false)
    private Integer stock_min_alimento;

    @Column(name = "eliminado", nullable = false)
    private boolean eliminado;


}
