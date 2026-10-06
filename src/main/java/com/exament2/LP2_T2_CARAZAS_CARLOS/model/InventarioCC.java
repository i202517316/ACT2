package com.exament2.LP2_T2_CARAZAS_CARLOS.model;

import java.math.BigDecimal;
import java.time.LocalDate;

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
@Table(name = "tbl_inventario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InventarioCC {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numero")
	private Integer numero;
	
	@Column(name = " fecha_vencimiento")
	private LocalDate fechaVencimiento;
	
	@Column(name = "costo_ingreso")
	private BigDecimal costoIngreso;
	
	@Column(name = "cantidad")
	private Integer cantidad;
	
	@Column(name = "lote")
	private String lote;

	@Column(name = "cod_estado")
	private String codEstado;
	
	@ManyToOne
	@JoinColumn(name = "id_producto")
	private ProductoCC productoCC;
	
}
