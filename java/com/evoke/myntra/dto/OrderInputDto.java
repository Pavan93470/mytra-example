package com.evoke.myntra.dto;

import java.util.List;

public class OrderInputDto {

	private List<OrderItemDto> orderItemDtos;
	private long userId;

	public List<OrderItemDto> getOrderItemDtos() {
		return orderItemDtos;
	}

	public void setOrderItemDtos(List<OrderItemDto> orderItemDtos) {
		this.orderItemDtos = orderItemDtos;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

}
