package com.prueba.tripulantes.tripulantesservice.service;

import com.prueba.tripulantes.tripulantesservice.entities.Tripulantes;

import java.util.List;

public interface TripulantesService {

    Tripulantes saveTripulante(Tripulantes tripulante);

    List<Tripulantes> getAllTripulantes();
    Tripulantes getTripulante(String tripulanteId);
}
