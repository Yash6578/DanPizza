package com.accenture.pizza.service;

import java.util.List;
import java.util.Map;

import com.accenture.pizza.bean.PizzaBean;
import com.accenture.pizza.entity.PizzaEntity;

public interface PizzaService {
	void add(PizzaBean pizzaBean);
	
	List<PizzaEntity> findall();
	
	Map<String, String> findallAndGivePizzaIdAndName();
	
	Integer getPriceByPizzaId(Integer id);
}
