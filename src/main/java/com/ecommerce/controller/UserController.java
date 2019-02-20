package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/user")
public class UserController
{
	@RequestMapping("/test")
	public String testUser()
	{
		return "hello ecom user";
	}
	@RequestMapping("/home")
	public String redirectToUserHome()
	{
		System.out.println("user home");
		return "user_home";
	}
}
