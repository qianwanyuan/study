package com.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DepartmentListServlet")
public class DepartmentListServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String departmentName = request.getParameter("departmentName");
		 request.setAttribute("departmentName", departmentName);
	        request.getRequestDispatcher("output.jsp").forward(request, response);
	}

}
