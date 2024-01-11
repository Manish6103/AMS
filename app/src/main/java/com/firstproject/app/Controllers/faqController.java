package com.firstproject.app.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class faqController {
	
	@GetMapping("/pages-faq") 
	 public String getcountries() 
	 { 
	 return "pages-faq"; 
	 } 

}
