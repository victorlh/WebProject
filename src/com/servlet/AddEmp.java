package com.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class AddEmp extends HttpServlet{
	public void service(HttpServletRequest request,
			HttpServletResponse response) throws
			ServletException,IOException{
		String name = request.getParameter("name");
		String salaryStr = request.getParameter("salary");
		double salary = Double.parseDouble(salaryStr);
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager
			.getConnection("jdbc:mysql://localhost:3306/sd1101db",
					"root","1234");
			PreparedStatement prep = 
				conn.prepareStatement(
						"insert into t_emp(name,salary) values(?,?)");
			prep.setString(1, name);
			prep.setDouble(2, salary);
			prep.executeUpdate();
			PrintWriter out = response.getWriter();
			out.println("<h1>add success</h1>");
			out.println("<tables >");
			out.println("</table>");
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new ServletException(e);
			}
		}
		
	}
}
