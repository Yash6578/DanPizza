package com.accenture.pizza.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.pizza.bean.PizzaOrderBean;
import com.accenture.pizza.service.PizzaOrderService;
import com.accenture.pizza.service.PizzaService;

@Controller
public class SaveOrderController {
	@Autowired
	PizzaService pizzaService;
	
	@Autowired
	PizzaOrderService pizzaOrderService;
	
	@GetMapping("/saveOrder")
	ModelAndView loadSaveOrderPage() {
		return new ModelAndView("SaveOrderPage", "pizzaOrderBean", new PizzaOrderBean());
	}
	
	
	@PostMapping("pizza/order")
	ModelAndView placeOrder(@ModelAttribute("pizzaOrderBean") PizzaOrderBean pizzaOrderBean) {
		pizzaOrderService.add(pizzaOrderBean);
		return new ModelAndView("HomePage");
	}
	
	//Dynamic drop down for pizza Name
	@ModelAttribute("pizzaList")
	Map<String, String> getallPizza() {
		System.out.println("**Model attribute for pizza INITIALIZED**");
		return pizzaService.findallAndGivePizzaIdAndName();
	}
}
