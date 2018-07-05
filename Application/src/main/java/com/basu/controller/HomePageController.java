package com.basu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {
	
	@RequestMapping(value= {"/home","/index"})
	public String showHome() {
		return "This is homepage Test";
	}

}
