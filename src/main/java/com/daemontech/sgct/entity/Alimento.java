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

    @JoinColumn(name = "FK_ALIMENTO_NOMBRE_ALIMENTO", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Nombre_Alimento nombreAlimento;

    @JoinColumn(name = "FK_ALIMENTO_UNIDAD_ALIMENTO", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Unidad_Alimento unidadAlimento;

    @Column(name = "MARCA_ALIMENTO", nullable = false, length = 50, unique = false)
    private String marcaAlimento;

    @Column(name = "STOCK_MINIMO_ALIMENTO", nullable = false, length = 50, unique = false)
    private Integer Stock_Min_Alimento;

    @Column(name = "ELIMINADO", nullable = false)
    private boolean eliminado;


}
