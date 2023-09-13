package com.evoke.myntra.dto;

import com.evoke.myntra.entity.OrderTrackingEntity;

public class OrderTracking {
	private long id;
	private long orderid;
	private String orderedDate;

	private OrderTrackingEntity orderTrackingEntity;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getOrderid() {
		return orderid;
	}

	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}

	public String getOrderedDate() {
		return orderedDate;
	}

	public void setOrderedDate(String orderedDate) {
		this.orderedDate = orderedDate;
	}

	public OrderTrackingEntity getOrderTrackingEntity() {
		return orderTrackingEntity;
	}

	public void setOrderTrackingEntity(OrderTrackingEntity orderTrackingEntity) {
		this.orderTrackingEntity = orderTrackingEntity;
	}

}
