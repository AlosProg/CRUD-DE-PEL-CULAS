package com.curso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pelicula")
public class Pelicula {

	@Id
	private int isbn;
	private String titulo;
	private String director;
	
	public Pelicula(int isbn, String titulo, String director) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.director = director;
	}

	public Pelicula() {
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	
	
	
	
	
}
