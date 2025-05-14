package com.personajes.jojos.repository;

/* Importamos la clase (model) */
import com.personajes.jojos.model.Jojos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JojosRepository extends JpaRepository<Jojos, Integer> {
}
