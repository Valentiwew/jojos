package com.personajes.jojos.repository;

/* Importamos la clase (model) */
import com.personajes.jojos.model.Personajes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonajesRepository extends JpaRepository<Personajes, Integer> {
}
