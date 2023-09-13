package com.evoke.myntra.dto;

public class DiscountDto {
	private long id;
	private float totalCost;
	private float costToPaid;
	private float discount;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	public float getCostToPaid() {
		return costToPaid;
	}

	public void setCostToPaid(float costToPaid) {
		this.costToPaid = costToPaid;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

}
