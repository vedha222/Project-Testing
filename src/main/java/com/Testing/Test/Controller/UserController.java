package com.Testing.Test.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.GetMapping;

public class UserController {
	
	 @GetMapping("/test")
	    public String testEndpoint() {
	        return "Test API is working Successfully!";
	    }
}
