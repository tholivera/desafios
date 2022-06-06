package com.conversor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.conversor.model.Numeros;

@Repository
public interface NumerosRepository extends JpaRepository<Numeros, Long> {

	public List<Numeros> findAllByNumeroRomanoContainingIgnoreCase(String numeroRomano);
}
