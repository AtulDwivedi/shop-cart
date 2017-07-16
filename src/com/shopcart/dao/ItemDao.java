package com.shopcart.dao;

import java.util.List;

import com.shopcart.dto.Item;

public interface ItemDao {
	
	int insertItem(Item item);

	int updateItem(Item item);
	
	int deleteItem(long itemId);

	Item getItemById(long itemId);

	List<Item> getItems();
}
