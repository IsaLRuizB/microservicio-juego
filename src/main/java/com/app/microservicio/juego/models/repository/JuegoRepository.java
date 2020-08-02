package com.app.microservicio.juego.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.commons.alquiler.models.entity.Juego;

@Repository
public interface JuegoRepository extends CrudRepository<Juego,Long> {
	
	
	
	@Query("Select j from Juego j where j.titulo = ?1")
	public Juego findByTitulo(String term);	
	@Query("Select j from Juego j where j.director=?1")
	public List<Juego> findByDirector(String director);
	@Query("Select j from Juego j where j.protagonista=?1")
	public List<Juego> findByProtagonista(String protagonista);
	@Query("Select j from Juego j where j.productor=?1 or j.marca=?2")
	public List<Juego> findByProductorOrMarca(String productor, String marca);
	
	

}
