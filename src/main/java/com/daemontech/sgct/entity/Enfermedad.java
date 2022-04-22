package com.daemontech.sgct.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name="ENFERMEDADES")
@Data
public class Enfermedad implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Enfermedad() {
		super();
	}
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_enfermedad")
	private Long id_Enfermedad;
//
	@Column(name = "enfermedad", nullable = false, length = 50, unique = true)
	private String enfermedad;
   
	@OneToMany(mappedBy="enfermedadV")
	private List<Enfermedad_R_Variante> enfermedades_variantes;
	
	@OneToMany(mappedBy="enfermedadVT")
	private List<Enfermedad_R_Ternera_R_Variante> enfermedades_terneras_variantes;

	
	
}
