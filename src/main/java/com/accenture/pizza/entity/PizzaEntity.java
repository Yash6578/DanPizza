package com.accenture.pizza.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pizza")
public class PizzaEntity {
	/*
	 * Data Member
	 */
	/*
	 * primary key
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer pizzaId;
	
	String PizzaName;
	Integer price;
	
	/*
	 * Constructor
	 */
	public PizzaEntity() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Member Functions
	 */
	public Integer getPizzaId() {
		return pizzaId;
	}
	public void setPizzaId(Integer pizzaId) {
		this.pizzaId = pizzaId;
	}
	public String getPizzaName() {
		return PizzaName;
	}
	public void setPizzaName(String pizzaName) {
		PizzaName = pizzaName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	/*
	 * To String Method
	 */
	@Override
	public String toString() {
		return "PizzaEntity [pizzaId=" + pizzaId + ", PizzaName=" + PizzaName + ", price=" + price + "]";
	}
}
