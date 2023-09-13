package com.evoke.myntra.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item")

public class ItemEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "category")
	private String category;

	@Column(name = "color")
	private String color;

	@Column(name = "brand")
	private String brand;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "available_qty")
	private int availableQuantity;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "item_price_id", referencedColumnName = "id")
	private PriceEntity itemPrice;
	@ManyToOne(fetch = FetchType.LAZY)
	private OrderResponseEntity orderResponseEntity;

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

	public PriceEntity getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(PriceEntity itemPrice) {
		this.itemPrice = itemPrice;
	}

	public OrderResponseEntity getOrderResponseEntity() {
		return orderResponseEntity;
	}

	public void setOrderResponseEntity(OrderResponseEntity orderResponseEntity) {
		this.orderResponseEntity = orderResponseEntity;
	}

	public ItemEntity(Long id, String name, String description, String category, String color, String brand,
			int quantity, int availableQuantity) {
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

	public ItemEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
