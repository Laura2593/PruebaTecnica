package com.prueba.tripulantes.tripulantesservice.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Nave {

    private String naveId;
    private String tripulanteId;
    private String nombre;
    private String descripcion;


}
