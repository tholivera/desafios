package com.conversor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Numeros {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
		
	private String numeroDecimal;
		
	private String numeroRomano;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroDecimal() {
		return numeroDecimal;
	}

	public void setNumeroDecimal(String numeroDecimal) {
		this.numeroDecimal = numeroDecimal;
	}

	public String getNumeroRomano() {
		return numeroRomano;
	}

	public void setNumeroRomano(String numeroRomano) {
		this.numeroRomano = numeroRomano;
	}

	
}
