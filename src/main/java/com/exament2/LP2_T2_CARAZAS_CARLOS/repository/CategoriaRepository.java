package com.exament2.LP2_T2_CARAZAS_CARLOS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exament2.LP2_T2_CARAZAS_CARLOS.model.CategoriaCC;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaCC, Integer> {
}
