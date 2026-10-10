package com.exament2.LP2_T2_CARAZAS_CARLOS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("producto")
public class ProductoController {

	@GetMapping({"", "listado", "listadoCarazas"})
	public String index() {
		return "redirect:/inventario/listado";
	}
}
