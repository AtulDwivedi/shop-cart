package com.shopcart.dao;

import java.util.List;

import com.shopcart.dto.OrderLine;

public interface OrderLineDao {
	
	int insertOrderLine(OrderLine orderLine);

	int updateOrderLine(OrderLine orderLine);

	int deleteOrderLine(long orderLineId);

	OrderLine getOrderLineById(long orderLineId);

	List<OrderLine> getOrderLines();
}
