package com.evoke.myntra.dto;

public class OrderDto {
	private int id;
	private String status;
	private String delieveryDate;
	private double orderCost;
	private UserDto userId;
	private AddressDto addressId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDelieveryDate() {
		return delieveryDate;
	}

	public void setDelieveryDate(String delieveryDate) {
		this.delieveryDate = delieveryDate;
	}

	public double getOrderCost() {
		return orderCost;
	}

	public void setOrderCost(double orderCost) {
		this.orderCost = orderCost;
	}

	public UserDto getUserId() {
		return userId;
	}

	public void setUserId(UserDto userId) {
		this.userId = userId;
	}

	public AddressDto getAddressId() {
		return addressId;
	}

	public void setAddressId(AddressDto addressId) {
		this.addressId = addressId;
	}

}
