package com.shopcart.dao;

public interface LoginDao {
	
	int insertLogin(String userName, String password);

	boolean checkLogin(String userName, String password);
	
	int updatePassword(String userName, String password);

}
