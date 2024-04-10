package com.prueba.naves.navesservice.services.impl;

import com.prueba.naves.navesservice.entities.Nave;
import com.prueba.naves.navesservice.repository.NaveRepository;
import com.prueba.naves.navesservice.services.NaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NaveServiceImpl implements NaveService {

    @Autowired
    private NaveRepository naveRepository;

    @Override
    public Nave create(Nave nave) {
        return naveRepository.save(nave);
    }

    @Override
    public List<Nave> getNaves() {
        return naveRepository.findAll();
    }

    @Override
    public List<Nave> getNaveByTripulanteId(String tripulanteId) {
        return naveRepository.findByTripulanteId(tripulanteId);
    }

}
