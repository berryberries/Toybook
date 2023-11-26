package com.toy.ToyEbook.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.toy.ToyEbook.member.dto.Member;
import com.toy.ToyEbook.member.service.face.MemberService;

@RequestMapping("/")
@Controller
public class MemberController {
	
	@Autowired MemberService memberService;
	
	@GetMapping("/loginForm")
	public String LoginForm() {
		return "/login/loginForm";
	}
	
	@PostMapping("/loginForm")
	public String isLogin(Member member){
		
		//유저 정보가져오는 객체. 수정필요 대강짜는거
		//service에서 로그인 성공시 메인페이지로 리턴
		// 실패시 입력창 하단부 경고문구 
		Member memberInfo = memberService.getUserInfo();

		return "redirect:/mainView"; 
	}
	
	@GetMapping("/mainView")
	public String showMain() {
		
		return "/login/mainView";
	}
}
