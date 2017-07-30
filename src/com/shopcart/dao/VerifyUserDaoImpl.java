package com.shopcart.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.shopcart.dao.util.ConnectionProvider;

public class VerifyUserDaoImpl implements VerifyUserDao {

	@Override
	public boolean verifyOtp(String email, String otp) {

		boolean retVal = false;

		try (Connection con = ConnectionProvider.getConnetion(); Statement stmt = con.createStatement()) {
			ResultSet rs = stmt.executeQuery("SELECT * FROM SK_VERIFY_USER WHERE USER_EMAIL='" + email + "'");
			rs.next();
			if (rs.getString(1).equals(email) && rs.getString(2).equals(otp)) {
				retVal = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return retVal;
	}

	@Override
	public int insertOtp(String email, String otp) {
		
		int retVal = 0;
		try (Connection con = ConnectionProvider.getConnetion(); Statement stmt = con.createStatement()) {
			retVal = stmt.executeUpdate(
					"INSERT INTO SK_VERIFY_USER VALUES('"+email+"', '"+otp+"', "+false+")");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return retVal;
		
	}

}
