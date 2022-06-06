package com.conversor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.conversor.model.Numeros;
import com.conversor.repository.NumerosRepository;


@RestController
@RequestMapping("/numeros")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class numerosController {
	
	@Autowired
	private NumerosRepository numerosRepository;
	
	
	@GetMapping
	public List<Numeros> listar() {
		return numerosRepository.findAll();
	}
	
	@GetMapping("/numeros/{numeroRomano}")
	public ResponseEntity<List<Numeros>> getByNumero(@PathVariable String numeroRomano) {
		return ResponseEntity.ok(numerosRepository.findAllByNumeroRomanoContainingIgnoreCase(numeroRomano));
	}
	
	@PostMapping
	@ResponseStatus (HttpStatus.CREATED)
	public Numeros inserir(@RequestBody Numeros numeros) {
		return numerosRepository.save(numeros);
	}
	
	

}
