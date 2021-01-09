package com.bjsxt.boot.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 定义Servlet，不使用Servlet注解配置Servlet信息。
 * 不使用注解，可以降低代码和注解配置的耦合。
 * 将配置和代码分离。
 * 可以使用自定义类型，进行配置。
 */
public class SecondServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		resp.getWriter().println("<center><h1>测试Servlet2</h1></center>");
	}
	
}
