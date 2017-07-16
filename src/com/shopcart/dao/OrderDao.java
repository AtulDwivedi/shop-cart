package com.shopcart.dao;

import java.util.List;

import com.shopcart.dto.Order;

public interface OrderDao {
	
	int insertOrder(Order order);

	int updateOrder(Order order);
	
	int deleteOrder(long orderId);

	Order getOrderById(long orderId);

	List<Order> getOrders();
}
