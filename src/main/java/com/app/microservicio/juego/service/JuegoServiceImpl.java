package com.app.microservicio.juego.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.commons.alquiler.models.entity.Juego;
import com.app.microservicio.juego.models.repository.JuegoRepository;
import com.common.microservicios.service.CommonsServiceImpl;

@Service
public class JuegoServiceImpl extends CommonsServiceImpl<Juego, JuegoRepository> implements JuegoService {

	
	@Autowired
	private JuegoRepository juegoRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Juego findByTitulo(String term) {		
		return juegoRepository.findByTitulo(term);
	}


	@Override
	@Transactional(readOnly = true)
	public List<Juego> findByDirector(String director) {		
		return juegoRepository.findByDirector(director);
	}


	@Override
	@Transactional(readOnly = true)
	public List<Juego> findByProtagonista(String protagonista) {	
		return juegoRepository.findByProtagonista(protagonista);
	}


	@Override
	@Transactional(readOnly = true)
	public List<Juego> findByProductorOrMarca(String productor, String marca) {		
		return juegoRepository.findByProductorOrMarca(productor, marca);
	}



}
