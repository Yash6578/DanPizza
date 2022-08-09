package com.accenture.pizza.bean;

public class BillRangeBean {
	/*
	 * Data Member
	 */
	Integer fromPrice;
	Integer toPrice;
	
	/*
	 * Constructor
	 */
	public BillRangeBean() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Getter and setters
	 */
	public Integer getFromPrice() {
		return fromPrice;
	}

	public void setFromPrice(Integer fromPrice) {
		this.fromPrice = fromPrice;
	}

	public Integer getToPrice() {
		return toPrice;
	}

	public void setToPrice(Integer toPrice) {
		this.toPrice = toPrice;
	}
	
	/*
	 * toString
	 */
	@Override
	public String toString() {
		return "BillRangeBean [fromPrice=" + fromPrice + ", toPrice=" + toPrice + "]";
	}
}
