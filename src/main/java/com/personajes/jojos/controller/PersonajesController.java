package com.personajes.jojos.controller;

/* Importamos las clases (model - service) */
import com.personajes.jojos.model.Personajes;
import com.personajes.jojos.service.PersonajesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/Personajes")
public class PersonajesController {

    private final PersonajesService service;

    public PersonajesController(PersonajesService service) {
        this.service = service;
    }

    @GetMapping
    public List<Personajes> getAll() {
        return service.getAllPersonajes();
    }

    @PostMapping
    public Personajes save(@RequestBody Personajes jojos) {
        return service.savePersonaje(jojos);
    }

    @GetMapping("/{id}")
    public Optional<Personajes> getById(@PathVariable int id) {
        return service.getPersonajeById(id);
    }

    @PutMapping("/{id}")
    public Optional<Personajes> update(@PathVariable int id, @RequestBody Personajes jojos) {
        return service.updatePersonaje(id, jojos);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        boolean eliminado = service.deletePersonaje(id);
        return eliminado ? "Personaje eliminado con éxito" : "Personaje no encontrado";
    }
}
