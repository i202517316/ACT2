package com.exament2.LP2_T2_CARAZAS_CARLOS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exament2.LP2_T2_CARAZAS_CARLOS.model.InventarioCC;

@Repository
public interface InventarioRepository extends JpaRepository<InventarioCC, Integer> {
	List<InventarioCC> findAllByOrderByNumeroDesc();
}
