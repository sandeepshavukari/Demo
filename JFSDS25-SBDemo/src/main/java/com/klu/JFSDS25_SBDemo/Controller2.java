package com.klu.JFSDS25_SBDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller2 {
	@GetMapping("/form")
	public String form()
	{
		return "index";
	}
	@GetMapping("/")
	public String home()
	{
		return "home";
	}
	@GetMapping("/loginaction")
	public String display()
	{
		return "display";
	}
//	@GetMapping("/formdetails")
//	@PostMapping("/formdetails")
//	public String formdetails(@RequestParam("fn") String name, @RequestParam("mb") String mobile, Model model)
//	{
//		model.addAttribute(name, name);
//		model.addAttribute(mobile, mobile);
//		return "formdetails";
//	}
	
	@GetMapping("/formdetails")
	public String formdetails(@RequestParam("fn") String name,@RequestParam("mb") String mobile,Model model) 
	{
		model.addAttribute("name", name);
		model.addAttribute("mobile", mobile);
		
		return "formdetails";
	}
	
	@GetMapping("/input/{name}")
	public String path(@PathVariable("name") String name, Model model)
	{
		model.addAttribute("name", name);
		return "urldisplay";
	}
	@GetMapping("input/{a}/{b}")
	public String add(@PathVariable("a") int a, @PathVariable("b") int b, Model model)
	{
		int sum=a+b;
		model.addAttribute("sum", sum);
		return "add";
	}
}
