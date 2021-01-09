package com.bjsxt.boot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

public class SecondListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("second listener initialized ...");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}

}
