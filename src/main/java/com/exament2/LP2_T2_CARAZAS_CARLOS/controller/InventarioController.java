package com.exament2.LP2_T2_CARAZAS_CARLOS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.exament2.LP2_T2_CARAZAS_CARLOS.model.InventarioCC;
import com.exament2.LP2_T2_CARAZAS_CARLOS.service.InventarioService;
import com.exament2.LP2_T2_CARAZAS_CARLOS.service.ProductoService;
import com.exament2.LP2_T2_CARAZAS_CARLOS.util.Alert;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("inventario")
@RequiredArgsConstructor
public class InventarioController {

	private final InventarioService inventarioService;
	private final ProductoService productoService;

	@GetMapping("listado")
	public String listado(Model model) {
		model.addAttribute("lstInventarios", inventarioService.getAll());
		return "listadoCarazas";
	}

	@GetMapping("nuevo")
	public String nuevo(Model model) {
		model.addAttribute("lstProductos", productoService.getAll());
		model.addAttribute("inventario", new InventarioCC());
		return "nuevoCarazas";
	}

	@PostMapping("registrar")
	public String registrar(@ModelAttribute InventarioCC inventario, RedirectAttributes flash) {
		var response = inventarioService.create(inventario);

		var alert = Alert.sweetToast(response.mensaje(), "success", 5000);
		flash.addFlashAttribute("alert", alert);
		return "redirect:/inventario/listado";
	}

	@GetMapping("edicion/{id}")
	public String edicion(@PathVariable Integer id, Model model) {
		model.addAttribute("lstProductos", productoService.getAll());
		model.addAttribute("inventario", inventarioService.getOne(id));
		return "edicionCarazas";
	}

	@PostMapping("guardar")
	public String guardar(@ModelAttribute InventarioCC inventario, RedirectAttributes flash) {
		var response = inventarioService.update(inventario);

		var alert = Alert.sweetToast(response.mensaje(), "success", 5000);
		flash.addFlashAttribute("alert", alert);
		return "redirect:/inventario/listado";
	}
}
