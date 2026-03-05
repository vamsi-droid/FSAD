package com.SpringBoot_MVC_Annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody

@RestController
//@RequestMapping("/demo")
public class Client {
	
	@GetMapping("/welcome")
	//@ResponseBody
	public String display()
	{
		return "welcome controller";
	}

	@GetMapping("/d1")
	//@ResponseBody
	public String display1()
	{
		return "welcome controller from display1";
	}
	@GetMapping("/d2")
	public String display2()
	{
		return "welcome controller from display2";
	}
	@GetMapping("d3")
	public String display3()
	{
		return "welcome controller from display3";
	}
	@GetMapping(path="d4")
	public String display4()
	{
		return "welcome controller from display4";
	}
	@GetMapping(value="d5")
	public String display5()
	{
		return "welcome controller from display5";
	}
	
	@GetMapping(path="d6")
	public int display6(@RequestParam("id") int cid)
	{
		
		return cid;
	}


	@GetMapping(path="d7/{id}")
	public int display7(@PathVariable("id") int cid)
	{
		
		return cid;
	}

}
