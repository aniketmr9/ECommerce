package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/admin")
public class AdminController
{
	@RequestMapping("/test")
	public String testAdmin()
	{
		return "adminHome";
	}
	@RequestMapping("/home")
	public String redirectToAdminHome()
	{
		System.out.println("admin home");
		return "admin_home";
	}
	@RequestMapping("/file_upload")
	public String redirectToFileUpload()
	{
		return "file_upload";
	}
}
