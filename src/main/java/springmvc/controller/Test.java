package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Test {
	@RequestMapping("/test1")
	public String test1() {
		System.out.println("this is test1");
		return "redirect:/test2";
	}
	@RequestMapping("/test2")
	public String test2() {
		System.out.println("this is test2");
		return "redirect:/test3";
	}
	// ***************************Another Approach top do the redirection****************************
	@RequestMapping("/test3")
	public RedirectView test3() {
		System.out.println("this is test3");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("test4");
		return redirectView;
	}
	@RequestMapping("/test4")
	public String test4() {
		System.out.println("this is test4");
		return "Hello, this is my redirection";
	}
	
}
