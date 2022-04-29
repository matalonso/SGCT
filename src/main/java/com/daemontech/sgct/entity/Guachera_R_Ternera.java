package com.daemontech.sgct.entity;

import com.daemontech.sgct.entity.keys.Guachera_R_Ternera_PK;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Guachera_R_Ternera
 *
 */
@Entity
@Table(name = "GUACHERA_R_TERNERA")
@Data
public class Guachera_R_Ternera implements Serializable {


	private static final long serialVersionUID = 1L;

	public Guachera_R_Ternera() {
		super();
	}




@EmbeddedId
	private Guachera_R_Ternera_PK guachera_r_ternera_pk;
	

	@ManyToOne
	@JoinColumn(name = "id_ternera", referencedColumnName = "id_ternera", insertable = false, updatable = false)
	private Ternera ternera;

	@ManyToOne
	@JoinColumn(name = "id_guachera", referencedColumnName = "id_guachera", insertable = false, updatable = false)
	private Guachera guachera;

	@Column(name = "eliminado", nullable = false)
	private boolean eliminado;



}


