package com.kosta.wedderTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {

	@RequestMapping(value = "/login")
	public String login() {
		return "jsp/login/login";
	}
	@RequestMapping(value = "/signUp")
	public String signUp() {
		return "jsp/login/signUp";
	}
	@RequestMapping(value = "/emailVertify")
	public String emailVertify() {
		return "jsp/login/emailVertify";
	}
	@RequestMapping(value = "/consentForm")
	public String consentForm() {
		return "jsp/login/consentForm";
	}
}
