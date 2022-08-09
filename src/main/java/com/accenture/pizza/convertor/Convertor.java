package com.accenture.pizza.convertor;

import com.accenture.pizza.bean.PizzaBean;
import com.accenture.pizza.bean.PizzaOrderBean;
import com.accenture.pizza.entity.PizzaEntity;
import com.accenture.pizza.entity.PizzaOrderEntity;

public class Convertor {
	public static PizzaBean toPizzaBean(PizzaEntity pizzaEntity) {
		PizzaBean pizzaBean = new PizzaBean();
		
		pizzaBean.setPizzaId(pizzaEntity.getPizzaId());
		pizzaBean.setPizzaName(pizzaEntity.getPizzaName());
		pizzaBean.setPrice(pizzaEntity.getPrice());
		
		return pizzaBean;
	}
	
	public static PizzaEntity toPizzaEntity(PizzaBean pizzaBean) {
		PizzaEntity pizzaEntity = new PizzaEntity();
		
		pizzaEntity.setPizzaName(pizzaBean.getPizzaName());
		pizzaEntity.setPrice(pizzaBean.getPrice());
		
		return pizzaEntity;
	}
	
	public static PizzaOrderEntity toPizzaOrderEntity(PizzaOrderBean pizzaOrderBean) {
		PizzaOrderEntity pizzaOrderEntity = new PizzaOrderEntity();
		
		pizzaOrderEntity.setCustomerName(pizzaOrderBean.getCustomerName());
		pizzaOrderEntity.setContactNumber(pizzaOrderBean.getContactNumber());
		pizzaOrderEntity.setPizzaId(pizzaOrderBean.getPizzaId());
		pizzaOrderEntity.setQuantity(pizzaOrderBean.getQuantity());
		
		pizzaOrderEntity.setBill(pizzaOrderBean.getBill());
		
		return pizzaOrderEntity;
	}

}
