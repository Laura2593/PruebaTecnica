package com.prueba.naves.navesservice.controllers;

import com.prueba.naves.navesservice.entities.Nave;
import com.prueba.naves.navesservice.services.NaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/naves")
public class NaveController {

    @Autowired
    private NaveService naveService;

    @PostMapping
    public ResponseEntity<Nave> guardarNaves(@RequestBody Nave calificacion){
        return ResponseEntity.status(HttpStatus.CREATED).body(naveService.create(calificacion));
    }

    @GetMapping
    public ResponseEntity<List<Nave>> listarCalificaciones(){
        return ResponseEntity.ok(naveService.getNaves());
    }

    @GetMapping("/usuarios/{tripulanteId}")
    public ResponseEntity<List<Nave>> listarCalificacionesPorUsuarioId(@PathVariable String tripulanteId){
        return ResponseEntity.ok(naveService.getNaveByTripulanteId(tripulanteId));
    }

}
