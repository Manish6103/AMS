package com.firstproject.app.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;


@Controller
public class PagesLoginController {
	
	@GetMapping("/pages-login") 
	 public String getlogin()  { 
	 return "pages-login"; 
	 }  
}    

