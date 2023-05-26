package com.curso.service;

import java.util.List;

import com.curso.model.Pelicula;

public interface PeliculasService {
	
	List<Pelicula> listarPeliculas();
	Pelicula buscarPelicula(int isbn);
	void altaPelicula(Pelicula pelicula);
	void actualizarPelicula(Pelicula pelicula);
	List<Pelicula> eliminarPelicula(int isbn);
}
