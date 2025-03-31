package com.jwt.sc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class SecurityControlller {
	
	@GetMapping("/getUser")
	public String getUser(HttpServletRequest httpServletRequest) {
		return httpServletRequest.getSession().getId();
	}
		
}
