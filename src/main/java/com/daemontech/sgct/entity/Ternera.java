package com.daemontech.sgct.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Ternera
 *
 */
@Entity
@Table(name="TERNERAS")
@Data
public class Ternera implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Ternera() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ternera")
	private Long id_ternera;
	
	@Column(name = "caravana_ternera", nullable = false, length = 50, unique = true)
	private Integer	caravana_ternera;

	@Column(name = "id_padr_tern", nullable = false, length = 50, unique = false)
	private Integer	id_padr_tern;
	
	@Column(name = "id_madr_tern", nullable = false, length = 50, unique = false)
	private Integer	id_madr_tern;
	
	@Column(name = "fec_alt_tern", nullable = false, length = 50, unique = false)
	private LocalDate fec_alt_tern;
	
	@Column(name = "fec_nac_tern", nullable = false, length = 50, unique = false)
	private LocalDate fec_nac_tern;

	@Column
	@Enumerated(EnumType.STRING)
	private Enumerados.Raza_Ternera raza_ternera;

	@Column
	@Enumerated(EnumType.STRING)
	private Enumerados.Tipo_Parto_Ternera tipo_parto_ternera;

	@OneToMany(mappedBy="terneraVT",fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	private List<Enfermedad_R_Ternera_R_Variante> enfermedades_terneras_variantes;

	@JoinColumn(name = "FK_peso_nac", nullable = false)
	@ManyToOne(optional = false, cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	private Peso peso_nac;

	@JoinColumn(name = "FK_motivo_baja_ternera", nullable = true)
	@ManyToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Motivo_Baja_Ternera id_motivo_baja_terner;

}
