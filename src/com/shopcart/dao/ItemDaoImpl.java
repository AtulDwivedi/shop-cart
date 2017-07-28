package com.shopcart.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.shopcart.dao.util.ConnectionProvider;
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
		
		Connection con = ConnectionProvider.getConnetion();
		try {
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT itemId,itemName,itemDescription,Price,availableQuantity,itemImageId,Category FROM ITEM");
			
			while(rs.next())
			{
				int Item_id= rs.getInt(1);
				String Item_name = rs.getString(2);
				String  Item_Description= rs.getString(3);
				int Price = rs.getInt(4);
				int available_Quantity = rs.getInt(5);
				String Item_Image_Id= rs.getString(6);
				String Category = rs.getString(7);
				
				 System.out.print("Item_id"+Item_id);
				 System.out.print("Item_name" +Item_name);
				 System.out.print("Item_Description" +Item_Description);
				 System.out.print("Price" +Price);
				 System.out.print("available_Quantity" +available_Quantity);
				 System.out.print("Item_Image_Id" + Item_Image_Id);
				 System.out.print("Category" + Category);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}


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
