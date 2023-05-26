package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.curso.model.Pelicula;

import com.curso.service.PeliculasService;

@RestController
public class PeliculasController {
	
	@Autowired
	PeliculasService service;
	
	
		//http://localhost:8080/pelicula/333
		@GetMapping(value="pelicula/{isbn}", produces=MediaType.APPLICATION_JSON_VALUE)
		public Pelicula buscarLibro(@PathVariable int isbn) {
			return service.buscarPelicula(isbn);
		}
		
		//http://localhost:8080/pelicula
		@GetMapping(value="pelicula", produces=MediaType.APPLICATION_JSON_VALUE)
		public List<Pelicula> listarPeliculas(){
			return service.listarPeliculas();
		}
		
		//http://localhost:8080/pelicula
		@PostMapping(value="pelicula", consumes=MediaType.APPLICATION_JSON_VALUE)
		public void altaPelicula(@RequestBody Pelicula pelicula) {
			service.altaPelicula(pelicula);
		}
		
		//http://localhost:8080/pelicula
		@PutMapping(value="pelicula", consumes=MediaType.APPLICATION_JSON_VALUE)
		public void actualizarPelicula(@RequestBody Pelicula pelicula) {
			service.actualizarPelicula(pelicula);
		}
		
		//
		@DeleteMapping(value="pelicula/{isbn}", produces=MediaType.APPLICATION_JSON_VALUE)
		public List<Pelicula> eliminarPelicula(@PathVariable int isbn){
			return service.eliminarPelicula(isbn);
		}

}
