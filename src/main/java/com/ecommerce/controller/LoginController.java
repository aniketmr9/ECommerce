package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecommerce.model.User;
import com.ecommerce.service.ECommerceService;

@Controller
@RequestMapping("/")
public class LoginController
{
	@Autowired
	private ECommerceService eCommerceService;
	
	@RequestMapping("/loginForm")
	public String redirectToLoginForm()
	{
		System.out.println("in login");
		return "login";
	}
	
	@RequestMapping("/register")
	public String redirectToRegisterForm()
	{
		System.out.println("in reg");
		return "register";
	}
	
	@RequestMapping(path="/registerUser", method = RequestMethod.POST)
	public String registerUser(User user)
	{
		System.out.println("reg user");
		System.out.println(user.toString());
		eCommerceService.registerUser(user);
		return "login";
	}
	
}
