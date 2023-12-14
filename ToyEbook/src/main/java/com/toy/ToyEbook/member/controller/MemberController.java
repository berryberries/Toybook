package com.toy.ToyEbook.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.toy.ToyEbook.member.dto.Member;
import com.toy.ToyEbook.member.service.face.MemberService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/")
@RequiredArgsConstructor
@Controller
public class MemberController {
	
	@Autowired MemberService memberService;
	
	@GetMapping("/join")
	public String joinForm() {
		return "/login/join";
	}
	
	@PostMapping("/join")
	public String userJoin(Member member) {
		
		//유저 삽입 메서드
		int joinResult = memberService.memberJoin(member);
		
		String viewPage = null;
		// 가입 완료 : 1 
		if(joinResult == 1) { viewPage = "/login/loginForm";
		
		}else { viewPage = "/login/join";}
		
		return viewPage;
	}
	
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
		
		if(memberInfo != null) return "loginForm";
		


		return "redirect:/mainView"; 
	}
	
	@GetMapping("/mainView")
	public String showMain() {
		
		return "/login/mainView";
	}
	
	
}
