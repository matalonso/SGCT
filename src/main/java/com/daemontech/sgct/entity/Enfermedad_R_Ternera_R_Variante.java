package com.daemontech.sgct.entity;

import com.daemontech.sgct.entity.keys.Enfermedad_R_Ternera_R_Variante_PK;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Guachera_R_Ternera
 */
@Entity
@Table(name = "ENFERMEDAD_R_TERNERA_R_VARIANTE")
@Data


public class Enfermedad_R_Ternera_R_Variante implements Serializable {


    public Enfermedad_R_Ternera_R_Variante() {
        super();
    }


    private static final long serialVersionUID = 1L;


    @EmbeddedId
    private Enfermedad_R_Ternera_R_Variante_PK enfermedad_r_ternera_r_variante_pk;

    @Column(name = "fc_fin_enfe", nullable = false)
    private LocalDate fc_fin_enfe;

	@Column(name = "severidad",nullable = false)
	@Enumerated(EnumType.ORDINAL) // ordinal porque pide numerico
    private Enumerados.Severidad_Enfermedad severidad_enfermedad;

    @Column
    @Enumerated(EnumType.STRING)
    private Enumerados.Motivo_Baja_Enfermedad motivo_baja_enfermedad;

    @ManyToOne
    @JoinColumn(name = "id_ternera", referencedColumnName = "id_ternera", insertable = false, updatable = false)
    private Ternera terneraVT;

    @ManyToOne
    @JoinColumn(name = "id_enfermedad", referencedColumnName = "id_enfermedad", insertable = false, updatable = false)
    private Enfermedad enfermedadVT;

    @JoinColumn(name = "id_variante_enfermedad", referencedColumnName = "id_variante_enfermedad", insertable = false, updatable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Variante_Enfermedad varianteVT;






}