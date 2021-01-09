package com.bjsxt.boot.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * 使用Servlet3.0提供的注解实现配置。
 * @WebFilter 注解 - 配置一个filter过滤器。 <filter><filter-mapping>
 * urlPatterns - 过滤器要过滤的路径。字符串数组。
 * 
 * 一般来说，Spring容器在加载配置信息的时候，有限加载@Configuration注解相关的配置。再加载其他注解的配置。
 * 在当前的案例环境中，相当于在配置文件web.xml中配置的filter顺序是： SecondFilter -> FirstFilter
 */
@WebFilter(urlPatterns="/*", initParams={@WebInitParam(name="test", value="test init param value")})
public class FirstFilter implements Filter {

	/**
	 * init方法只运行唯一一次。在容器启动的时候初始化。
	 */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// 处理初始化参数？
		String initParamValue = filterConfig.getInitParameter("test");
		System.out.println("init param value : " + initParamValue);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("first filter run...");
		chain.doFilter(request, response);
		System.out.println("first filter end...");
	}

	/**
	 * destroy方法运行唯一一次，在容器关闭的时候执行。
	 */
	@Override
	public void destroy() {
		
	}

}
