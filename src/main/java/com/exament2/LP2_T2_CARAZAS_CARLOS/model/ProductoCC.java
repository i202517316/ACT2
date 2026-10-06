package com.exament2.LP2_T2_CARAZAS_CARLOS.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tbl_producto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductoCC {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "stock_actual")
	private Integer stockActual;
	
	@Column(name = "stock_maximo")
	private Integer stockMaximo;

	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private CategoriaCC categoriaCC;
}
