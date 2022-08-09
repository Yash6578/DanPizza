package com.accenture.pizza.service;

import java.util.List;

import com.accenture.pizza.bean.BillRangeBean;
import com.accenture.pizza.bean.PizzaOrderBean;
import com.accenture.pizza.entity.PizzaOrderEntity;

public interface PizzaOrderService {
	void add(PizzaOrderBean pizzaOrderBean);
	List<PizzaOrderEntity> findAll();
	
	List<PizzaOrderEntity> findByBillBetween(BillRangeBean billRangeBean);
}
