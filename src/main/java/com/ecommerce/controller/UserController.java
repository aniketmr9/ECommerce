package com.ecommerce.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController
{
	@RequestMapping("/test")
	public String testUser()
	{
		return "hello ecom user";
	}
}
