package com.shopcart.dto;

public class OrderLine {

	private long orderLineId;
	private long itemId;
	private String itemName;
	private String itemDescription;
	private double price;
	private int orderedQuantity;

	public long getOrderLineId() {
		return orderLineId;
	}

	public void setOrderLineId(long orderLineId) {
		this.orderLineId = orderLineId;
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getOrderedQuantity() {
		return orderedQuantity;
	}

	public void setOrderedQuantity(int orderedQuantity) {
		this.orderedQuantity = orderedQuantity;
	}

	@Override
	public String toString() {
		return "OrderLine [orderLineId=" + orderLineId + ", itemId=" + itemId + ", itemName=" + itemName
				+ ", itemDescription=" + itemDescription + ", price=" + price + ", orderedQuantity=" + orderedQuantity
				+ "]";
	}

}
