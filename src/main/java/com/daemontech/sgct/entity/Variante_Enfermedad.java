package com.daemontech.sgct.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name="VARIANTES_ENFERMEDAD")
@Data

public class Variante_Enfermedad implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8640060475960556964L;

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_variante_enfermedad")
	private Long id_Variante_Enfermedad;

	@Column(name = "variante_enfermedad", nullable = false, length = 50, unique = true)
	private String variante_enfermedad;

	@Column(name = "eliminado", nullable = false)
	private boolean eliminado;
	
	@OneToMany(fetch = FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="varianteV")
	private List<Enfermedad_R_Variante> enfermedades_variantes;
	
	@OneToMany(fetch = FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="varianteVT")
	private List<Enfermedad_R_Ternera_R_Variante> enfermedades_terneras_variantes;
		

	}