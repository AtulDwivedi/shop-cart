package com.shopcart.dao;

import java.util.ArrayList;
import java.util.List;

import com.shopcart.dto.Item;

public class ItemDaoImpl implements ItemDao {

	@Override
	public int insertItem(Item item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateItem(Item item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteItem(long itemId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Item getItemById(long itemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> getItems() {
		List<Item> items = new ArrayList<Item>();
		
		Item item1 = new Item();
		item1.setItemName("Car 1");
		item1.setItemImageId("0001.jpg");
		
		Item item2 = new Item();
		item2.setItemName("Car 2");
		item2.setItemImageId("0001.jpg");
		
		items.add(item1);
		items.add(item2);
		return items;
	}

}
