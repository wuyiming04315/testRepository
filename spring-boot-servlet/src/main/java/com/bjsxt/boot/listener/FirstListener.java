package com.bjsxt.boot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebListener;

@WebListener
public class FirstListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		String p = sce.getServletContext().getInitParameter("p1");
		System.out.println("init parameter p1 = " + p);
	
		System.out.println("first listener initialized ...");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}

}
