package com.prueba.naves.navesservice.repository;

import com.prueba.naves.navesservice.entities.Nave;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NaveRepository extends JpaRepository<Nave,Long> {

    List<Nave> findByTripulanteId(String tripulanteId);

}
