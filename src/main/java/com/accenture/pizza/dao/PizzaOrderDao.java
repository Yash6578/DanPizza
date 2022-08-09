 package com.accenture.pizza.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.accenture.pizza.entity.PizzaOrderEntity;

public interface PizzaOrderDao extends CrudRepository<PizzaOrderEntity, Integer>{
	List<PizzaOrderEntity> findByBillBetweenOrderByBill(Double fromPrice, Double toPrice);
}
