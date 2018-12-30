package com.esme.spring.faircorp.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LightDao extends JpaRepository<Light,Long> {   // Crée un DAO capable d'avoir recours à toutes les méthodes implémentées dans le JpaRepository - interface supplémentaire de Spring Data JPA
}
