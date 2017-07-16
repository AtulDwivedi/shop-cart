package com.shopcart.dao;

import java.util.List;

import com.shopcart.dto.User;

public interface UserDao {

	int insertUser(User user);

	int updateUSer(User user);

	User getUserById(String userId);

	List<User> getUsers();

}
