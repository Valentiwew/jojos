package com.personajes.jojos.service;

/* Importamos las clases (model - repository) */
import com.personajes.jojos.model.Jojos;
import com.personajes.jojos.repository.JojosRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JojosService {

    private final JojosRepository repository;

    public JojosService(JojosRepository repository) {
        this.repository = repository;
    }

    public List<Jojos> getAllPersonajes() {
        return repository.findAll();
    }

    public Jojos savePersonaje(Jojos jojos) {
        return repository.save(jojos);
    }

    public Optional<Jojos> getPersonajeById(int id) {
        return repository.findById(id);
    }

    public Optional<Jojos> updatePersonaje(int id, Jojos nuevo) {
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
