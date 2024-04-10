package com.prueba.tripulantes.tripulantesservice.repository;

import com.prueba.tripulantes.tripulantesservice.entities.Tripulantes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripulantesRepository extends JpaRepository<Tripulantes,String> {
    Tripulantes findAllById(String tripulanteId);
}
