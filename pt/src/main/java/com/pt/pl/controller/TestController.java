package com.pt.pl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping(value="/test/{testId}")
	@ResponseBody
	public String testMsg(@PathVariable("testId") String testId){
		return testId;
	}
}
