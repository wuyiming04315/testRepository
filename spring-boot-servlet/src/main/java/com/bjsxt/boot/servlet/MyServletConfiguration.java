package com.bjsxt.boot.servlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义配置类型。
 * @Configuration - 当前类型是一个配置类。相当于定义了一个配置文件。用于配置Spring容器。
 *  配置Spring容器，实际上就是在配置容器中管理的bean对象。
 *  在当前类中定义方法，返回值可以通过@Bean注解，加入到Spring容器中，让Spring容器来管理对象。
 *  
 * 当前注册Servlet的方式是Spring boot推荐的方式。代码和配置分离，弱耦合。
 */
@Configuration
public class MyServletConfiguration {

	/*
	 * <bean id="xxx" class="ServletRegistrationBean" />
	 * 
	 * ServletRegistrationBean - Spring boot web中定义的用于注册Servlet对象的Bean。
	 */
	@Bean(name="xxx")
	public ServletRegistrationBean getServletRegistrationBean(){
		ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
		// 设置servlet-name
		bean.setName("second");
		// 增加一个url-pattern
		bean.addUrlMappings("/second");
		// <init-param><param-name>test</param-name><param-value>value</param-value></init-param>
		bean.addInitParameter("test", "value");
		// <load-on-startup>1</load-on-startup>
		bean.setLoadOnStartup(1);
		return bean;
	}
	
}
