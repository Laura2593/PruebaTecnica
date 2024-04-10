package com.prueba.naves.navesservice.services;

import com.prueba.naves.navesservice.entities.Nave;

import java.util.List;

public interface NaveService {

    Nave create(Nave nave);

    List<Nave> getNaves();

    List<Nave> getNaveByTripulanteId(String tripulanteId);

}
