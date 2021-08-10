package com.github.alvarohsp.citiesapi.estados;

import java.util.List;

import com.github.alvarohsp.citiesapi.estados.repository.EstadoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estados")
public class EstadoResource {

    private final EstadoRepository repository;

    public EstadoResource(final EstadoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Estado> estados() {
        return repository.findAll();
    }
}
