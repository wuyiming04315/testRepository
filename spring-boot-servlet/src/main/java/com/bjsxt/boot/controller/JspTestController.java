package com.bjsxt.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspTestController {

	@RequestMapping("/testJsp")
	public String testJsp(Model model){
		
		model.addAttribute("test", "测试");
		
		// return "forward:/WEB-INF/jsp/testJsp.jsp";
		
		return "testJsp";
	}
	
}
