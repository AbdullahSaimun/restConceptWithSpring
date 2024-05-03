package com.saimun.restconceptapplication;

public class Order {
	private String customerName;
	private String productName;
	private Integer quantity;

	public Order(String customerName, String productName, Integer quantity) {
		this.customerName = customerName;
		this.productName = productName;
		this.quantity = quantity;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Order{" +
				"customerName='" + customerName + '\'' +
				", productName='" + productName + '\'' +
				", quantity=" + quantity +
				'}';
	}


}
