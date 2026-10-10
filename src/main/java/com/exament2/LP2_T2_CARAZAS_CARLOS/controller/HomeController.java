package com.exament2.LP2_T2_CARAZAS_CARLOS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "redirect:/inventario/listado";
	}
}
