package com.app.microservicio.juego.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.commons.alquiler.models.entity.Juego;

@Repository
public interface JuegoRepository extends CrudRepository<Juego,Long> {

}
