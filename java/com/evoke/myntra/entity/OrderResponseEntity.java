
package com.evoke.myntra.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orderResponse")
public class OrderResponseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_response_id", referencedColumnName = "id")
	private OrderEntity orderId;
	@Column(name = "quantityOrdered")
	private int quantityOrdered;

	@OneToMany(mappedBy = "orderResponseEntity")
	private List<ItemEntity> itemEntity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public OrderEntity getOrderId() {
		return orderId;
	}

	public void setOrderId(OrderEntity orderId) {
		this.orderId = orderId;
	}

	public int getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public List<ItemEntity> getItemEntity() {
		return itemEntity;
	}

	public void setItemEntity(List<ItemEntity> itemEntity) {
		this.itemEntity = itemEntity;
	}

}
