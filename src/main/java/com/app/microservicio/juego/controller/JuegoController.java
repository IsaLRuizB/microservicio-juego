package com.app.microservicio.juego.controller;

import org.springframework.web.bind.annotation.RestController;

import com.app.commons.alquiler.models.entity.Juego;
import com.app.microservicio.juego.service.JuegoService;
import com.common.microservicios.controller.CommonController;


@RestController
public class JuegoController extends CommonController<Juego, JuegoService> {

}
