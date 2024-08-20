package com.kosta.wedderTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {

	@RequestMapping(value = "/login")
	public String login() {
		return "jsp/users/login";
	}
	
	
	@RequestMapping(value = "/signUp")
	public String signUp() {
		return "jsp/users/signUp";
	}
	
	/* 회원 가입 페이지 불러오기   	*/
	@GetMapping(value = "/signup")
	public String signupcheck() {
		return "jsp/users/signUp";
	}
	/*    	*/
	@RequestMapping(value = "/emailVertify")
	public String emailVertify() {
		return "jsp/users/emailVertify";
	}
	@RequestMapping(value = "/consentForm")
	public String consentForm() {
		return "jsp/users/consentForm";
	}
}
