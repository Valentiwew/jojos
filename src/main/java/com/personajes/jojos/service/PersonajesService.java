package com.personajes.jojos.service;

/* Importamos las clases (model - repository) */
import com.personajes.jojos.model.Personajes;
import com.personajes.jojos.repository.PersonajesRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonajesService {

    private final PersonajesRepository repository;

    public PersonajesService(PersonajesRepository repository) {
        this.repository = repository;
    }

    public List<Personajes> getAllPersonajes() {
        return repository.findAll();
    }

    public Personajes savePersonaje(Personajes jojos) {
        return repository.save(jojos);
    }

    public Optional<Personajes> getPersonajeById(int id) {
        return repository.findById(id);
    }

    public Optional<Personajes> updatePersonaje(int id, Personajes nuevo) {
        return repository.findById(id).map(personaje -> {
            personaje.setNombre(nuevo.getNombre());
            personaje.setEdad(nuevo.getEdad());
            return repository.save(personaje);
        });
    }

    public boolean deletePersonaje(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
