package com.toy.ToyEbook.Controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

	@GetMapping("/")
	public String main() {
		return "index";
	}
}