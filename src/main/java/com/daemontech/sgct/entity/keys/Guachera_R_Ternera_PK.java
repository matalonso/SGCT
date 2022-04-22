package com.daemontech.sgct.entity.keys;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;

@Embeddable
public class Guachera_R_Ternera_PK implements Serializable {

    private static final long serialVersionUID = -5431412749175457078L;

    public Guachera_R_Ternera_PK(){
        super();
    }

    public Guachera_R_Ternera_PK(Long id_Ternera, Long id_Guachera, LocalDate fec_Ingreso_Ter) {
        this.id_Ternera = id_Ternera;
        this.id_Guachera = id_Guachera;
        this.fec_Ingreso_Ter = fec_Ingreso_Ter;
    }

    @Column(name="ID_TERNERA")
    private Long id_Ternera;

    @Column(name="ID_GUACHERA")
    private Long id_Guachera;

    @Column(name="FEC_INGRESO_TER")
    private LocalDate fec_Ingreso_Ter;

}