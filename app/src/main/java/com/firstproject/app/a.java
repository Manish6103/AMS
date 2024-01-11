package com.firstproject.app;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.GetMapping; 

@Controller 
public class a{ 
 
 @GetMapping("/index") 
 public String goHome() 
 { 
 return "index"; 
 } 
} 

