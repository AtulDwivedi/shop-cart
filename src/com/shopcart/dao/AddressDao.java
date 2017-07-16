package com.shopcart.dao;

import java.util.List;

import com.shopcart.dto.Address;

public interface AddressDao {
	int insertAddress(Address address);

	int updateAddress(Address address);

	int deleteAddress(long addressId);

	Address getAddressById(long addressId);

	List<Address> getAddresses();
}
