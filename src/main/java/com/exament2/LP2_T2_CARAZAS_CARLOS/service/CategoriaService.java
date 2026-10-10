package com.exament2.LP2_T2_CARAZAS_CARLOS.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exament2.LP2_T2_CARAZAS_CARLOS.model.CategoriaCC;
import com.exament2.LP2_T2_CARAZAS_CARLOS.repository.CategoriaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoriaService {

	private final CategoriaRepository categoriaRepository;

	public List<CategoriaCC> getAll() {
		return categoriaRepository.findAll();
	}
}
