package com.daemontech.sgct.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import com.daemontech.sgct.entity.Enumerados;
import javax.persistence.*;


@Entity
@Table(name = "PESOS")
@Data
public class Peso implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -4205404024139984658L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_peso")
    private Long id_peso;


    @Column(name = "fecha_peso")
    private LocalDate fecha_peso;

    @Column(name = "peso")
    private Double peso;


    @Column
    @Enumerated(EnumType.ORDINAL)
    private Enumerados.TipoPeso tipo_Peso ;

    @JoinColumn(name = "FK_tenera_peso", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Ternera id_ternera;

    @Column(name = "eliminado", nullable = false)
    private boolean eliminado;

}
