package com.personajes.jojos.model;

/* Importa las anotaciones de JPA para trabajar con bases de datos */
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data /* Genera automaticamente getters, setters, equals, hashCode y toString */
@AllArgsConstructor /* Genera un constructor con un argumento por cada campo en la clase */
@NoArgsConstructor /* Genera un constructor sin argumentos */
@Entity /* Marca esta clase como una entidad JPA */
@Table(name = "Jojos") /* Especifica el nombre de la tabla en la base de datos */

public class Jojos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String edad;
}
