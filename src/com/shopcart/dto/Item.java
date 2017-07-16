package com.shopcart.dto;

public class Item {

	private long itemId;
	private String itemName;
	private String itemDescription;
	private double price;
	private int availaleQuantity;
	private String itemImageId;
	private String category;

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

	public int getAvailaleQuantity() {
		return availaleQuantity;
	}

	public void setAvailaleQuantity(int availaleQuantity) {
		this.availaleQuantity = availaleQuantity;
	}

	public String getItemImageId() {
		return itemImageId;
	}

	public void setItemImageId(String itemImageId) {
		this.itemImageId = itemImageId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemDescription=" + itemDescription + ", price="
				+ price + ", availaleQuantity=" + availaleQuantity + ", itemImageId=" + itemImageId + ", category="
				+ category + "]";
	}

}
