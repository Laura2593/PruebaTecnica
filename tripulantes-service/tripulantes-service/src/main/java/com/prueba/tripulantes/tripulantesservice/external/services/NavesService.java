package com.prueba.tripulantes.tripulantesservice.external.services;

import com.prueba.tripulantes.tripulantesservice.entities.Nave;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "NAVES-SERVICE")
public interface NavesService {

    @GetMapping("/naves/{navesId}")
    Nave getNaves(@PathVariable String naves);

}
