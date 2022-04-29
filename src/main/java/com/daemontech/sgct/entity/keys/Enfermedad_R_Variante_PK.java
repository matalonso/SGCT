package com.daemontech.sgct.entity.keys;

import lombok.Data;

import java.io.Serializable;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
@Data
public class Enfermedad_R_Variante_PK implements Serializable {

	private static final long serialVersionUID = -1665809482837259186L;

	@Column(name = "id_enfermedad")
	private Long id_Enfermedad;


	@Column(name = "id_Variante_Enfermedad")
	private Long id_Variante_Enfermedad;

	@Column(name = "eliminado", nullable = false)
	private boolean eliminado;

	public Enfermedad_R_Variante_PK(Long id_Enfermedad, Long id_Variante_Enfermedad) {
		this.id_Enfermedad = id_Enfermedad;
		this.id_Variante_Enfermedad=id_Variante_Enfermedad;
	}


	public Enfermedad_R_Variante_PK() {

	}
}
