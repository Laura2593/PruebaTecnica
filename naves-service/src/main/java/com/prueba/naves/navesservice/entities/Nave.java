package com.prueba.naves.navesservice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Nave {

    @Id
    private String idNave;
    private String TripulantesId;
    private String descrfipcion;
}
