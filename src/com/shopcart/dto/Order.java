package com.shopcart.dto;

import java.util.Date;
import java.util.List;

public class Order {

	private long orderId;
	private Date createdDate;
	private Date deliveryDate;

	private List<OrderLine> items;

	private String userId;
	private long addressId;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public List<OrderLine> getItems() {
		return items;
	}

	public void setItems(List<OrderLine> items) {
		this.items = items;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", createdDate=" + createdDate + ", deliveryDate=" + deliveryDate
				+ ", items=" + items + ", userId=" + userId + ", addressId=" + addressId + "]";
	}

}
