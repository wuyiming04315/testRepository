package com.bjsxt.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 启动SpringBoot应用。
 * SpringBoot是一个spring应用，有应用启动入口。
 * SpringApplication.run
 * 
 * @SpringBootApplication - 注解当前类是一个spring应用入口类型。
 * 
 * @ServletComponentScan - 通知spring容器，扫描Servlet注解的。如： @WebServlet
 *  默认的扫描路径是，当前启动类所在包及其所有的子孙包。
 *  
 * SpringBoot有一个全局的配置文件，文件命名为application.properties，文件保存路径为classpath。
 * 在这个配置文件中，可以定义springboot相关的所有的可配置内容。
 */
@SpringBootApplication
@ServletComponentScan
public class AppStarter {

	public static void main(String[] args) {
		SpringApplication.run(AppStarter.class, args);
	}
	
}
