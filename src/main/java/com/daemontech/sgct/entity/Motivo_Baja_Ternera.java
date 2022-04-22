package com.daemontech.sgct.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: MOTIVO_BAJA_TERNERA
 */
@Entity
@Table(name = "MOTIVOS_BAJA_TERNERA")

@Data
public class Motivo_Baja_Ternera implements Serializable {


    private static final long serialVersionUID = 1L;

    public Motivo_Baja_Ternera() {
        super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_motivo_baja_terner")
    private Integer id_motivo_baja_terner;

    @Column(name = "motivo_baja_terner", nullable = false, length = 50, unique = true)
    private String motivo_baja_terner;

    @OneToMany(cascade = CascadeType.MERGE, mappedBy = "id_motivo_baja_terner")
    private List<Ternera> terneras;


}
