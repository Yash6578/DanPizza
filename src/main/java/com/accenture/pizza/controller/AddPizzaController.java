package com.accenture.pizza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.pizza.bean.PizzaBean;
import com.accenture.pizza.service.PizzaService;

@Controller
public class AddPizzaController {
	
	@Autowired
	PizzaService pizzaService;
	
	@GetMapping("/addPizza")
	ModelAndView loadAddPizzaPage() {
		return new ModelAndView("AddPizzaPage", "pizzaBean", new PizzaBean());
	}
	
	@PostMapping("/pizza/save")
	String savePizza(@ModelAttribute("pizzaBean") PizzaBean pizzaBean) {
		pizzaService.add(pizzaBean);
		return "HomePage";
	}
}
