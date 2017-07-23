package com.shopcart.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopcart.dao.LoginDao;
import com.shopcart.dao.LoginDaoImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String userName = request.getParameter("un");
		String pass = request.getParameter("pass");
		if ((new LoginDaoImpl()).checkLogin(userName, pass)) {
			String message = "Login successful!";
			request.setAttribute("msg", message);

			RequestDispatcher rd1 = request.getRequestDispatcher("home.jsp");
			rd1.forward(request, response);

		} else {
			response.sendRedirect("login.jsp");

		}
	}
}