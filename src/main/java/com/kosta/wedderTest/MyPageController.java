package com.kosta.wedderTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyPageController {
	
	@RequestMapping(value = "/mypage")
	public String mypage() {
		return "jsp/myPage/mypage";
	}
	@RequestMapping(value="/estimateStorage")
	public String estimateStorage() {
		return "jsp/myPage/estimateStorage";
	}
	@RequestMapping(value = "/likeList")
	public String likeList() {
		return "jsp/myPage/likeList";
	}
	@RequestMapping(value="/myPayment")
	public String myPayment() {
		return "jsp/myPage/myPayment";
	}
	@RequestMapping(value="/myRefund")
	public String myRefund() {
		return "jsp/myPage/myRefund";
	}
	
}
