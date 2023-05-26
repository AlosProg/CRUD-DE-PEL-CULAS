package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.curso.dao.PeliculasDao;
import com.curso.model.Pelicula;

@Service
public class PeliculasServiceImp implements PeliculasService {

	@Autowired
	PeliculasDao dao;
	
	@Override
	public List<Pelicula> listarPeliculas() {
		
		return dao.findAll();
	}

	@Override
	public Pelicula buscarPelicula(int isbn) {
		
		return dao.findById(isbn).orElse(null);
	}

	@Override
	public void altaPelicula(Pelicula pelicula) {
		
		dao.save(pelicula);

	}

	@Override
	public void actualizarPelicula(Pelicula pelicula) {
		
		dao.save(pelicula);

	}

	@Override
	public List<Pelicula> eliminarPelicula(int isbn) {
		dao.deleteById(isbn);
		return dao.findAll();
	}

}
