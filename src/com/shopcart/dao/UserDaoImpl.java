package com.shopcart.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.shopcart.dao.util.ConnectionProvider;
import com.shopcart.dto.User;

public class UserDaoImpl implements UserDao {

	@Override
	public int insertUser(User user) {
		int retVal = 0;
		try (Connection con = ConnectionProvider.getConnetion(); Statement stmt = con.createStatement()) {
			retVal = stmt.executeUpdate(
					"INSERT INTO SK_USER (USER_NAME, USER_EMAIL, USER_MOBILE, AGE) VALUES('" + user.getName() + "', '"
							+ user.getEmail() + "', '" + user.getMobile() + "', " + user.getAge() + ")");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return retVal;
	}

	@Override
	public int updateUSer(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User getUserById(String userId) {

		User user = null;

		try (Connection conn = ConnectionProvider.getConnetion()) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(
					"SELECT USER_NAME, USER_EMAIL, USER_MOBILE, USER_AGE FROM SK_USER WHERE USER_ID ='" + userId + "'");
			rs.next();

			String userName = rs.getString(1);
			String userEmail = rs.getString(2);
			String userMobile = rs.getString(3);
			int userAge = rs.getInt(4);

			user = new User();

			user.setName(userName);
			user.setEmail(userEmail);
			user.setMobile(userMobile);
			user.setAge(userAge);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
