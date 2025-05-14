package com.personajes.jojos.controller;

/* Importamos las clases (model - service) */
import com.personajes.jojos.model.Jojos;
import com.personajes.jojos.service.JojosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/Jojos")
public class JojosController {

    private final JojosService service;

    public JojosController(JojosService service) {
        this.service = service;
    }

    @GetMapping
    public List<Jojos> getAll() {
        return service.getAllPersonajes();
    }

    @PostMapping
    public Jojos save(@RequestBody Jojos jojos) {
        return service.savePersonaje(jojos);
    }

    @GetMapping("/{id}")
    public Optional<Jojos> getById(@PathVariable int id) {
        return service.getPersonajeById(id);
    }

    @PutMapping("/{id}")
    public Optional<Jojos> update(@PathVariable int id, @RequestBody Jojos jojos) {
        return service.updatePersonaje(id, jojos);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        boolean eliminado = service.deletePersonaje(id);
        return eliminado ? "Personaje eliminado con éxito" : "Personaje no encontrado";
    }
}
