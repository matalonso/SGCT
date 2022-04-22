package com.daemontech.sgct.entity;

import com.daemontech.sgct.entity.keys.Enfermedad_R_Variante_PK;
import lombok.Data;

import java.io.Serializable;


import javax.persistence.*;

/**
 * Entity implementation class for Entity: Guachera_R_Ternera
 *
 */
@Entity
@Table(name = "ENFERMEDAD_R_VARIANTE")
@Data
public class Enfermedad_R_Variante implements Serializable {


	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Enfermedad_R_Variante_PK enfermedad_r_variante_pk;

	@ManyToOne
	@JoinColumn(name = "id_variante_enfermedad", referencedColumnName = "id_variante_enfermedad", insertable = false, updatable = false)
	private Variante_Enfermedad varianteV;

	@ManyToOne
	@JoinColumn(name = "id_enfermedad", referencedColumnName = "id_enfermedad", insertable = false, updatable = false)
	private Enfermedad enfermedadV;



}