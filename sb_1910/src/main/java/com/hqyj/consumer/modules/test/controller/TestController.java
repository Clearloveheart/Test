package com.hqyj.consumer.modules.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping
public class TestController {
	@RequestMapping("/test/info")
	@ResponseBody
	public String appInfo() {
		return "This is spring boot app.";
	}
}
