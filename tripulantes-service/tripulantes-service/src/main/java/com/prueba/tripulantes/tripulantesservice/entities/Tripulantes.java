package com.prueba.tripulantes.tripulantesservice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tripulantess")
public class Tripulantes {

    @Id
    @Column(name = "idTripulante")
    private String idTripulante;

    @Column(name = "nombre",length = 20)
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Transient
    private List<Nave> naves = new ArrayList<>();

}
