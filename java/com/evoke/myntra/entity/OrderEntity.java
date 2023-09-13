package com.evoke.myntra.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ordercreation")
public class OrderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "status")
	private String status;
	@Column(name = "delieveryDate")

	private Date delieveryDate;
	@Column(name = "orderCost")
	private double orderCost;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_order_id", referencedColumnName = "id")
	private UserEntity user;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_address_id", referencedColumnName = "id")
	private AddressEntity address;
//	@OneToOne(mappedBy = "ordertracking")
//
//	private OrderTrackingEntity orderTrackingEntity;

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

	public Date getDelieveryDate() {
		return delieveryDate;
	}

	public void setDelieveryDate(Date delieveryDate) {
		this.delieveryDate = delieveryDate;
	}

	public double getOrderCost() {
		return orderCost;
	}

	public void setOrderCost(double orderCost) {
		this.orderCost = orderCost;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}

}
