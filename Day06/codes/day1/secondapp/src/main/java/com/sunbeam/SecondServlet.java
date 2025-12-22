package com.sunbeam;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class SecondServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(req, resp);
	}
	protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fruit = req.getParameter("fruit"); 
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter(); 
		out.println("<html>");
		out.println("<head>");
		out.println("<title>First</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2> First Servlet</h2>");
		out.println("<h3>" + req.getMethod() + "REQUEST</h2>");
		out.println("<h4>Sweet " + fruit + "</h4>"); 
		out.println("</body>");
		out.println("</html>"); 
	}
}
