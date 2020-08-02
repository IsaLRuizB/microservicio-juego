package com.app.microservicio.juego.service;

import java.util.List;

import com.app.commons.alquiler.models.entity.Juego;
import com.common.microservicios.service.CommonsService;

public interface JuegoService extends CommonsService<Juego> {

	
	public Juego findByTitulo(String term);
	public List<Juego>  findByDirector(String director);
	public List<Juego>  findByProtagonista(String protagonista);
	public List<Juego>  findByProductorOrMarca(String productor, String marca);
}
