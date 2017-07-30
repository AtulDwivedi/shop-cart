package com.shopcart.dao;

public interface VerifyUserDao {
	int insertOtp(String email, String otp);
	boolean verifyOtp(String email, String otp);
}
