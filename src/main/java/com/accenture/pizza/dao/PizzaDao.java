package com.accenture.pizza.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.pizza.entity.PizzaEntity;

public interface PizzaDao extends JpaRepository<PizzaEntity, Integer>{
	
}
