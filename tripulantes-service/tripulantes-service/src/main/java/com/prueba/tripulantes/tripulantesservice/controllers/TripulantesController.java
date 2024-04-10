package com.prueba.tripulantes.tripulantesservice.controllers;

import com.prueba.tripulantes.tripulantesservice.entities.Tripulantes;
import com.prueba.tripulantes.tripulantesservice.service.TripulantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Tripulantes")
public class TripulantesController {

    @Autowired
    private TripulantesService tripulantesService;

    @PostMapping
    public ResponseEntity<Tripulantes> guardarTripulante(@RequestBody Tripulantes tripulanteRequest){
        Tripulantes tripulante = tripulantesService.saveTripulante(tripulanteRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(tripulante);
    }

    @GetMapping("/{tripulanteId}")
    public ResponseEntity<Tripulantes> obtenerTripulante(@PathVariable String tripulanteId){
        Tripulantes tripulante = tripulantesService.getTripulante(tripulanteId);
        return ResponseEntity.ok(tripulante);
    }

    @GetMapping
    public ResponseEntity<List<Tripulantes>> listarTripulantes(){
        List<Tripulantes> tripulantes = tripulantesService.getAllTripulantes();
        return ResponseEntity.ok(tripulantes);
    }
}
