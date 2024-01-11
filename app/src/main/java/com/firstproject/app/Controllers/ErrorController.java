package com.firstproject.app.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {
	
	
	
		@GetMapping("/pages-error-404") 
		 public String getcountries() 
		 { 
		 return "pages-error-404"; 
		 } 

}
