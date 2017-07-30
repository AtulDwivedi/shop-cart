package com.shopcart.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shopcart.dao.LoginDao;
import com.shopcart.dao.LoginDaoImpl;
import com.shopcart.dao.UserDao;
import com.shopcart.dao.UserDaoImpl;
import com.shopcart.dao.VerifyUserDao;
import com.shopcart.dao.VerifyUserDaoImpl;
import com.shopcart.dto.User;
import com.shopcart.service.mail.SimpleMailThruSSL;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/user/*")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String requestUri = request.getRequestURI();
		String[] requestUriSplit = requestUri.split("/");
		String action = requestUriSplit[requestUriSplit.length - 1];

		if (action.equals("register")) {
			User user = (User) request.getAttribute("user");

			UserDao userDao = new UserDaoImpl();
			int insertUserVal = userDao.insertUser(user);

			if (insertUserVal == 1) {
				LoginDao loginDao = new LoginDaoImpl();
				int insertLoginVal = loginDao.insertLogin(user.getEmail(), request.getParameter("password"));

				if (insertLoginVal == 1) {
					// TODO send OTP
					String otp = ((int)(Math.random()*10000))+"";
					
					VerifyUserDao verifyUserDao = new VerifyUserDaoImpl();
					verifyUserDao.insertOtp(user.getEmail(), otp);
					
					
					SimpleMailThruSSL.sendOtp(user.getEmail(), otp);
					
					HttpSession httpSession = request.getSession();
					httpSession.setAttribute("email", user.getEmail());
					
					response.sendRedirect("verify.jsp");
				}
			}
		}
		else if(action.equals("verify")){
			VerifyUserDao verifyUserDao = new VerifyUserDaoImpl();
			HttpSession httpSession = request.getSession(false);
			boolean val  = verifyUserDao.verifyOtp(httpSession.getAttribute("email").toString(), request.getParameter("otp"));
			if(val){
				response.sendRedirect("home.jsp");
			}
		}
	}

}
