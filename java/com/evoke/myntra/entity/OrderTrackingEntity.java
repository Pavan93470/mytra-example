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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ordertracking")
public class OrderTrackingEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
//	@Temporal(TemporalType.DATE)
	@Column(name = "orderedDate")
	private String orderedDate;

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "order_Tracking_id", referencedColumnName = "id")
	@Column(name = "orderid")
	private long orderid;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOrderedDate() {
		return orderedDate;
	}

	public void setOrderedDate(String orderedDate) {
		this.orderedDate = orderedDate;
	}

	public long getOrderid() {
		return orderid;
	}

	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}

}
