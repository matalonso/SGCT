package com.daemontech.sgct.entity;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="MEDICAMENTOS")
@Data
public class Medicamento implements Serializable {

	private static final long serialVersionUID = 1L;

	public Medicamento() {
		super();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_MEDICAMENTO")
	private Integer Id_Medicamento;
	
	@Column
	@Enumerated(EnumType.STRING)
	private Enumerados.Tipo_Medicamento tipo_medicamento;

	@Column
	@Enumerated(EnumType.STRING)
	private Enumerados.Tipo_Vacuna tipo_vacuna;

	@Column (name = "STOCK_MINIMO_MEDICAMENTO", nullable = false, length = 50, unique = false)
	private Integer stock_Min_Medicamento;
	
	@Column (name = "MARCA_MEDICAMENTO", nullable = false, length = 50, unique = false)
	private String marca_Medicamento;
	
	@Column(name = "ELIMINADO", nullable = false)
	private boolean eliminado;

		
	
}
