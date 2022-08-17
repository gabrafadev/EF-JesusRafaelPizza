package com.idat.EFJesusRafaelPizza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.EFJesusRafaelPizza.entity.Pizza;
import com.idat.EFJesusRafaelPizza.service.PizzaService;



@RestController
@RequestMapping("/api/pizza/v1")
public class PizzaController {

	@Autowired
	private PizzaService service;

	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Pizza pizza) {
		service.guardar(pizza);
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignarAlumnosAaula() {
		service.asignarPizza();
	}
}
