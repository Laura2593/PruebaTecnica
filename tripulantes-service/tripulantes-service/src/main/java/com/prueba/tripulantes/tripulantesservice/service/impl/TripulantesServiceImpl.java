package com.prueba.tripulantes.tripulantesservice.service.impl;

import com.prueba.tripulantes.tripulantesservice.entities.Tripulantes;
import com.prueba.tripulantes.tripulantesservice.external.services.NavesService;
import com.prueba.tripulantes.tripulantesservice.repository.TripulantesRepository;
import com.prueba.tripulantes.tripulantesservice.service.TripulantesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class TripulantesServiceImpl implements TripulantesService {

    private Logger logger = LoggerFactory.getLogger(TripulantesService.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private TripulantesRepository tripulantesRepository;

    @Autowired
    private NavesService navesService;


    @Override
    public Tripulantes saveTripulante(Tripulantes tripulante) {
        return tripulantesRepository.save(tripulante);
    }

    @Override
    public List<Tripulantes> getAllTripulantes() {
        return tripulantesRepository.findAll();
    }

    @Override
    public Tripulantes getTripulante(String tripulanteId) {
        return tripulantesRepository.findAllById(tripulanteId);
    }
}
