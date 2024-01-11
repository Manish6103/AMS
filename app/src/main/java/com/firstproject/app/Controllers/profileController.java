package com.firstproject.app.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class profileController {

	
	@GetMapping("/profile") 
	 public String getprofile() 
	 { 
	 return "profile"; 
	 }
}
