package com.daemontech.sgct.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name="GUACHERAS")
@Data
public class Guachera implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -5076274431891713179L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_guachera")
	private Long id_guachera;


	@Column(name = "fech_alt_guach", nullable = false)
	private LocalDate fec_alt_guach;

	@Column(name = "fec_baj_guach", nullable = true)
	private LocalDate fec_baj_guach;

	@Column(name = "capacidad", nullable = false)
	private int capacidad;

	@Column(name = "geolocalizacion", nullable = false, length = 50, unique = true)
	private String geolocalizacion;

	@Column(name = "radio_guach", nullable = true)
	private Double radio_guach;

	@Column(name = "largo_guach", nullable = true)
	private Double largo_Guach;

	@Column(name = "ancho_guach", nullable = true)
	private Double ancho_guach;

	@Column
	@Enumerated(EnumType.STRING)
	private Enumerados.Tipo_Guachera tipo_guachera;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "guachera")
	private List<Guachera_R_Ternera> GuacheraTerneras = new ArrayList<>();

}