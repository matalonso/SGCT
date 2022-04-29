package com.daemontech.sgct.entity;

public class Enumerados {


    public enum TipoPeso {
        INICIO,
        CONTROL

    }

    public enum Raza_Ternera {
        HOLANDO,
        JERSEY,
        SIMMENTAL,
        HOLSTEIN,
        NORMANDO
    }

    public enum Tipo_Guachera {
        CORRAL,
        ESTACA
    }

    public enum Tipo_Parto_Ternera {
        NATURAL,
        CESAREA
    }


    public enum Tipo_Medicamento {
        VACUNA,
        ANTIPARASITARIO,
        ANTIBIOTICO,
        ANTIINFLAMATORIO,
        SUERO_HIDRATANTE,
        SALES_REHIDRATANTES

    }

    public enum Tipo_Vacuna {
        CLOSTRIDIOS,
        ENF_RESPIRATORIA,
        ENF_DIARREA,
        VACUNAS_REPRODUCTIVAS,
        NO
    }

    public enum Motivo_Baja_Enfermedad {
        CURA,
        MUERTE
    }

    public enum Severidad_Enfermedad {
        UNO,
        DOS,
        TRES,
        CUATRO
    }

    public enum Motivo_Baja_Ternera {
        VENTA,
        MUERTE,
        EXTRAVIO,
        ROBO
    }

    public enum Unidad_Alimento {
        KG,
        L,
        G,
        ML
    }

}