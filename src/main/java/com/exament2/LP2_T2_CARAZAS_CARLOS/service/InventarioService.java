package com.exament2.LP2_T2_CARAZAS_CARLOS.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exament2.LP2_T2_CARAZAS_CARLOS.dto.ResultadoResponse;
import com.exament2.LP2_T2_CARAZAS_CARLOS.model.InventarioCC;
import com.exament2.LP2_T2_CARAZAS_CARLOS.repository.InventarioRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventarioService {

	private final InventarioRepository inventarioRepository;

	public List<InventarioCC> getAll() {
		return inventarioRepository.findAllByOrderByNumeroDesc();
	}

	public InventarioCC getOne(Integer numero) {
		return inventarioRepository.findById(numero).orElse(null);
	}

	@Transactional
	public ResultadoResponse create(InventarioCC inventario) {
		try {
			var registrado = inventarioRepository.save(inventario);
			var mensaje = String.format("Inventario Nro. %d registrado.", registrado.getNumero());
			return new ResultadoResponse(true, mensaje);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultadoResponse(false, "Hubo un error en la transacción");
		}
	}

	@Transactional
	public ResultadoResponse update(InventarioCC inventario) {
		try {
			var actualizado = inventarioRepository.save(inventario);
			var mensaje = String.format("Inventario Nro. %d actualizado.", actualizado.getNumero());
			return new ResultadoResponse(true, mensaje);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultadoResponse(false, "Hubo un error en la transacción");
		}
	}
}
