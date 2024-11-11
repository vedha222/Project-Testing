package com.Testing.Test.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class UserController {
	
	 @GetMapping("/test")
	    public String testEndpoint() {
	        return "Test Code is  Successfully Completed!";
	    }
	 
	 @GetMapping("/test/list")
	    public String getList() {
	        return "Test Code is  Working Completely!";
	    }
	 
	 @GetMapping("/test/list/data")
	    public String getListData() {
	        return " WELCOME TO TESTINGPROJECT!!!";
	    }
	 
	 @GetMapping("/test/list/all")
	    public String getAllListData() {
	        return " WELCOME TO THE PROJECT!!!";
	    }

}
