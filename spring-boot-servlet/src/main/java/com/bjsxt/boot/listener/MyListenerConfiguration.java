package com.bjsxt.boot.listener;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyListenerConfiguration {

	@Bean
	public ServletListenerRegistrationBean<SecondListener> getListenerRegistrationBean(){
		ServletListenerRegistrationBean<SecondListener> bean = 
				new ServletListenerRegistrationBean<>(new SecondListener());
		return bean;
	}
	
}
