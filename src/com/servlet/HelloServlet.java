package com.servlet;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class HelloServlet  extends HttpServlet{
	public void service(HttpServletRequest request,
			HttpServletResponse response) throws 
			ServletException,IOException{
		//假设用户输入
		//http://localhost:8080/web01/hello?name=zs
		//获得请求数据
		String name = request.getParameter("name");
		//对请求进行处理
		String rs = " <h1>hello " + name + "</h1>";
		//设置响应结果
		PrintWriter out = response.getWriter();
		out.println(rs);
		out.close();
			
		
	}
}
