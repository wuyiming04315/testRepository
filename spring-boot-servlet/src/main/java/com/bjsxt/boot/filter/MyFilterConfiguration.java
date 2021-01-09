package com.bjsxt.boot.filter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyFilterConfiguration {

	@Bean
	public FilterRegistrationBean getFilterRegistrationBean(){
		FilterRegistrationBean bean = new FilterRegistrationBean(new SecondFilter());
		List<String> urlPatterns = new ArrayList<>();
		urlPatterns.add("/*");
		bean.setUrlPatterns(urlPatterns);
		// 设置初始化参数
		// bean.addInitParameter("", "");
		return bean;
	}
	
}
