package com.toy.ToyEbook.Controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class MemberController {
	
	@GetMapping("/loginForm")
	public String LoginForm() {
		return "/login/loginForm";
	}
	
	@PostMapping("/loginForm")
	public String isLogin(){
		
		
		return "redirect:/mainView"; 
	}
	
	@GetMapping("/mainView")
	public String showMain() {
		
		return "/login/mainView";
	}
}
