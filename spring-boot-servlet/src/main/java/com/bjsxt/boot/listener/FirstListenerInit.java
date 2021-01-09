package com.bjsxt.boot.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FirstListenerInit implements ServletContextInitializer {

	/**
	 * 在系统启动的时候，进行的初始化逻辑。
	 */
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		servletContext.setInitParameter("p1", "test");
	}

}
