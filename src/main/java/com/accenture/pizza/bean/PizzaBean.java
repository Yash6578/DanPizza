package com.accenture.pizza.bean;

public class PizzaBean {
	/*
	 * Data Member
	 */
	Integer pizzaId;
	String pizzaName;
	Integer price;
	
	/*
	 * Constructor
	 */
	public PizzaBean() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Member Function
	 */
	public Integer getPizzaId() {
		return pizzaId;
	}
	public void setPizzaId(Integer pizzaId) {
		this.pizzaId = pizzaId;
	}
	public String getPizzaName() {
		return pizzaName;
	}
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	/*
	 * To String
	 */
	@Override
	public String toString() {
		return "PizzaBean [pizzaId=" + pizzaId + ", PizzaName=" + pizzaName + ", price=" + price + "]";
	}
}
