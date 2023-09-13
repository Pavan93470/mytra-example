package com.evoke.myntra.dto;

import com.evoke.myntra.dto.PriceDto;

public class ItemDto {

	private Long id;
	private String name;
	private String description;
	private String category;
                          
	
	private String color;
	private String brand;
	private int quantity;
	private int availableQuantity;
	private PriceDto PriceDto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public void addAttribute(String string, ItemDto items) {
		this.addAttribute(string, items);
	}

	public PriceDto getPriceDto() {
		return PriceDto;
	}

	public void setPriceDto(PriceDto PriceDto) {
		this.PriceDto = PriceDto;
	}

	public ItemDto(Long id, String name, String description, String category, String color, String brand, int quantity,
			int availableQuantity) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.category = category;
		this.color = color;
		this.brand = brand;
		this.quantity = quantity;
		this.availableQuantity = availableQuantity;

	}

	public ItemDto() {
		super();
		// TODO Auto-generated constructor stub
	}

}














