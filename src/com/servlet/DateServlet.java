package com.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Date;
public class DateServlet extends HttpServlet{
	public void service(HttpServletRequest request,
			HttpServletResponse response) throws
			ServletException,IOException{
		PrintWriter out = 
			response.getWriter();
		out.println("<h1>current date:" 
				+ (new Date()) + "</h1>");
		out.close();
		
		
	}
}
