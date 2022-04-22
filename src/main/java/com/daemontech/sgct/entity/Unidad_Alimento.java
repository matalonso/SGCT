package com.daemontech.sgct.entity;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Unidad_Alimento
 *
 */
@Entity
@Table(name = "UNIDADES_ALIMENTO")
@Data
public class Unidad_Alimento implements Serializable {


	private static final long serialVersionUID = 2959324717606981L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_unidad_alimento")
	private Integer id_unidad_alimento;

	@Column(name = "unidad_alimento", nullable = false, length = 25, unique = true)
	private String unidad_alimento;

}
