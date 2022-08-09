package com.accenture.pizza.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pizza_Order")
public class PizzaOrderEntity {
	/*
	 * Data member
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer orderId;
	
	String customerName;
	String contactNumber;
	//foreign key
	Integer pizzaId;
	Integer quantity;
	Double bill;
	
	/*
	 * constructor
	 */
	public PizzaOrderEntity() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Getter And Setters
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
	 * To String
	 */
	@Override
	public String toString() {
		return "PizzaOrderEntity [orderId=" + orderId + ", customerName=" + customerName + ", contactNumber="
				+ contactNumber + ", pizzaId=" + pizzaId + ", quantity=" + quantity + ", bill=" + bill + "]";
	}
}
