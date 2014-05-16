package com.servlet;
import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
public class EmployeeList extends HttpServlet{
	public void service(HttpServletRequest request,
			HttpServletResponse response) throws 
			ServletException,IOException{
		
		PrintWriter out = 
			response.getWriter();
		out.println("<table border='1' width='60%' cellpadding='0' cellspacing='0'>");
		out.println("<tr><td>id</td><td>name</td><td>salary</td></tr>");
		out.println("<tr><td>1</td><td>zs</td><td>2000</td></tr>");
		out.println("<tr><td>2</td><td>ww</td><td>3000</td></tr>");
		out.println("</table>");
		out.close();
		
		
		
		
	}
}
