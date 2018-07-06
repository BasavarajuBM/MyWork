package com.basu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.basu.vo.ResponseVO;

@RestController
public class HomePageController {
	
	@RequestMapping(value= {"/home","/index"})
	public String showHome() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseVO resp=restTemplate.getForObject("http://localhost:9080/ar/all", ResponseVO.class);
		System.out.println("Size of the list is: "+resp.getCollection().size());
		return "This is homepage Test";
	}

}
