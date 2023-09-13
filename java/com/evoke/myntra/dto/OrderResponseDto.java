
package com.evoke.myntra.dto;

import java.util.Date;
import java.util.List;

public class OrderResponseDto {
	private int orderId;
	private List<ItemDto> itemDtos;
	private AddressDto address;
	private UserDto userDto;
	private String status;
	private Date orderedDate;
	private Date delieveryDate;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public List<ItemDto> getItemDtos() {
		return itemDtos;
	}

	public void setItemDtos(List<ItemDto> itemDtos) {
		this.itemDtos = itemDtos;
	}

	public AddressDto getAddress() {
		return address;
	}

	public void setAddress(AddressDto address) {
		this.address = address;
	}

	public UserDto getUserDto() {
		return userDto;
	}

	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getOrderedDate() {
		return orderedDate;
	}

	public void setOrderedDate(Date orderedDate) {
		this.orderedDate = orderedDate;
	}

	public Date getDelieveryDate() {
		return delieveryDate;
	}

	public void setDelieveryDate(Date delieveryDate) {
		this.delieveryDate = delieveryDate;
	}

}