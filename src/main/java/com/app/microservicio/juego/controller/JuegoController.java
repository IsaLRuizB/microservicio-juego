package com.app.microservicio.juego.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.commons.alquiler.models.entity.Juego;
import com.app.microservicio.juego.service.JuegoService;
import com.common.microservicios.controller.CommonController;


@RestController
public class JuegoController extends CommonController<Juego, JuegoService> {
	

	
	@GetMapping("/buscar/{term}")
	public ResponseEntity<?> buscar(@PathVariable String term){
		return ResponseEntity.ok().body(this.service.findByTitulo(term));
	}
	
	@GetMapping("/buscar/protagonista/{term}")
	public ResponseEntity<?> buscarPorProtagonitas(@PathVariable String term){
		return ResponseEntity.ok().body(this.service.findByProtagonista(term));
	}
	
	@GetMapping("/buscar/director/{term}")
	public ResponseEntity<?> buscarPorDirector(@PathVariable String term){
		return ResponseEntity.ok().body(this.service.findByDirector(term));
	}
	
	@GetMapping("/buscar/filtro/{term}/{marca}")
	public ResponseEntity<?> buscarPorProductorOMarcas(@PathVariable String term, @PathVariable String marca){
		return ResponseEntity.ok().body(this.service.findByProductorOrMarca(term, marca));
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> editar( @RequestBody Juego juego,  @PathVariable Long id ){
		Optional<Juego> optional = this.service.findById(id);
		/*if(result.hasErrors()) {
			return this.validar(result);
		}*/		
		
		if(optional==null) {
			return ResponseEntity.notFound().build();			
		}
		
		Juego juegoDB = optional.get();
		juegoDB.setPrecioAlquiler(juego.getPrecioAlquiler());	
		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(juegoDB));
			
	}

}
