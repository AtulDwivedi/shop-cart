package com.shopcart.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.shopcart.dao.util.ConnectionProvider;

public class LoginDaoImpl implements LoginDao{

	@Override
	public int insertLogin(String userName, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean checkLogin(String userName, String password) {
		boolean retVal = false;
		
		System.out.println("This is inside checkLogin");
		 
		Connection con = ConnectionProvider.getConnetion();
		try {
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM LOGIN_TABLE");
			
			while(rs.next())
			{
				String un = rs.getString(1);
				String pass = rs.getString(2);
				
				if(un.equals(userName) && pass.equals(password))
				{
					System.out.println("Successfully logged in");
					retVal = true;
				}
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("The value of retVal is "+retVal);
		return retVal;
	}

	@Override
	public int updatePassword(String userName, String password) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
