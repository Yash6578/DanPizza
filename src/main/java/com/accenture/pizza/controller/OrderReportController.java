package com.accenture.pizza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.pizza.bean.BillRangeBean;
import com.accenture.pizza.entity.PizzaOrderEntity;
import com.accenture.pizza.service.PizzaOrderService;

@Controller
public class OrderReportController {
	
	@Autowired
	PizzaOrderService pizzaOrderService;
	
	@GetMapping("/orderReport")
	ModelAndView loadReportOrderPage() {
		return new ModelAndView("OrderReportPage", "billRangeBean", new BillRangeBean());
	}
	
	@PostMapping("pizza/report")
	ModelAndView generateReport(@ModelAttribute("billRangeBean") BillRangeBean billRangeBean) {
		ModelAndView mv = new ModelAndView();
		
		List<PizzaOrderEntity> report = pizzaOrderService.findByBillBetween(billRangeBean);
		
		mv.addObject("report", report);
		mv.setViewName("OrderReportPage");
		
		return mv; 
	}
	
}
