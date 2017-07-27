package com.shopcart.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.shopcart.dao.util.ConnectionProvider;
import com.shopcart.dto.User;

public class UserDaoImpl implements UserDao {

	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUSer(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User getUserById(String userId) {
		
		Connection con = ConnectionProvider.getConnetion();
		try {
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT user_id,name,email,mobile,age,address FROM USER_DETAILS");
			
			while(rs.next())
			{
				int user_id= rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String mobile = rs.getString(4);
				int age = rs.getInt(5);
				String address= rs.getString(6);
				
				 System.out.print("user id" +user_id);
				 System.out.print("name" +name);
				 System.out.print("email" +email);
				 System.out.print("mobile" +mobile);
				 System.out.print("age" +age);
				 System.out.print("address" + address);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
