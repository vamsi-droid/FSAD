package com.SpringBoot_MVC_Annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Clienthtml {
	
	@GetMapping("/html")
	public String gethtml() {
		
		return "index";
	}

}
