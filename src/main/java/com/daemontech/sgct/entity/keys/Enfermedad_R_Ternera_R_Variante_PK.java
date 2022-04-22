package com.daemontech.sgct.entity.keys;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class Enfermedad_R_Ternera_R_Variante_PK implements Serializable {


	private static final long serialVersionUID = -1665809482837259186L;

	
	@Column(name = "id_Enfermedad")
    private Long id_Enfermedad;
	
    @Column(name = "id_Ternera")
    private Long id_Ternera;
    
    @Column(name = "id_Variante_Enfermedad")
    private Long id_Variante_Enfermedad;
    
    @Column(name = "fec_inic_enf")
    private LocalDate fec_inic_enf;
    

}