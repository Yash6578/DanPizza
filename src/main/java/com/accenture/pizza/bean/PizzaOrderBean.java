package com.accenture.pizza.bean;

public class PizzaOrderBean {
	
	
	/*
	 * Data Member
	 */
	Integer orderId;
	String customerName;
	String contactNumber;
	Integer pizzaId;
	Integer quantity;
	Double bill;
	
	/*
	 * Constructor
	 */
	public PizzaOrderBean() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * getter setter
	 */
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Integer getPizzaId() {
		return pizzaId;
	}
	public void setPizzaId(Integer pizzaId) {
		this.pizzaId = pizzaId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getBill() {
		return bill;
	}
	public void setBill(Double bill) {
		this.bill = bill;
	}
	
	/*
	 * To String Method
	 */
	@Override
	public String toString() {
		return "PizzaOrder [orderId=" + orderId + ", customerName=" + customerName + ", contactNumber=" + contactNumber
				+ ", pizzaId=" + pizzaId + ", quantity=" + quantity + ", bill=" + bill + "]";
	}
}
