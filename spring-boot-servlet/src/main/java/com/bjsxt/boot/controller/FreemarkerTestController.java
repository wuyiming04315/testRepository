package com.bjsxt.boot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 在SpringBoot工程中，可以同时使用JSP，静态页面，静态模板作为视图技术。
 * 控制器返回结果，SpringBoot会动态判断，先从模板中查询视图，再从静态页面和JSP中查询视图。
 * 查询模板的位置就是src/main/resources/templates 返回结果不需要考虑静态模板后缀名。
 */
@RestController
public class FreemarkerTestController {
	

	/**
	 * 加机地址白名单认证
	 * 
	 * @param json
	 * @return Object
	 */
	@RequestMapping(value = "/addrWhitelistAuth", method = RequestMethod.POST)
	@ResponseBody
	public Object addrWhitelistAuth(@RequestBody String json) throws Exception {
		Map<String, Object> respMap = new HashMap<String, Object>();

		System.out.println(respMap);

		return "9999999999";
	}

	/**
	 * 通过商户协议ID获取商户MCC
	 * 
	 * @param f42Id
	 * @return List<AmMerchMcc>
	 */
	@RequestMapping(value = "/getAmMerchMccByF42Id", method = { RequestMethod.GET })
	@ResponseBody
	public Object getAmMerchMccByF42Id() throws Exception {

		String url = "http://localhost:8082/addrWhitelistAuth?$format=json&orderby=HasTicket/LastModTimestamp desc,IsConnectedTo/CreationTimestamp desc&$expand=HasCustomFieldMetadata,HasAutomatedFulfillmentDetails";

		RestTemplate client = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		HttpMethod method = HttpMethod.POST;
		// 以表单的方式提交
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		Student student =  new Student();
		student.setName("wuyiming");
		student.setAge(36);
		// 将请求头部和参数合成一个请求
		HttpEntity<Student> requestEntity = new HttpEntity<>(student, headers);
		// 执行HTTP请求，将返回的结构使用ResultVO类格式化
		ResponseEntity<String> response = client.exchange(url, method, requestEntity, String.class);

		return response.getBody();

	}

}
