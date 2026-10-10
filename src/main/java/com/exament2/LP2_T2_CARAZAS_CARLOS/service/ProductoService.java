package com.exament2.LP2_T2_CARAZAS_CARLOS.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exament2.LP2_T2_CARAZAS_CARLOS.model.ProductoCC;
import com.exament2.LP2_T2_CARAZAS_CARLOS.repository.ProductoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductoService {

	private final ProductoRepository productoRepository;

	public List<ProductoCC> getAll() {
		return productoRepository.findAll();
	}

	public ProductoCC getOne(Integer id) {
		return productoRepository.findById(id).orElse(null);
	}
}
