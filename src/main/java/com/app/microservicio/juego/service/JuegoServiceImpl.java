package com.app.microservicio.juego.service;

import org.springframework.stereotype.Service;

import com.app.commons.alquiler.models.entity.Juego;
import com.app.microservicio.juego.models.repository.JuegoRepository;
import com.common.microservicios.service.CommonsService;
import com.common.microservicios.service.CommonsServiceImpl;

@Service
public class JuegoServiceImpl extends CommonsServiceImpl<Juego, JuegoRepository> implements JuegoService {

}
