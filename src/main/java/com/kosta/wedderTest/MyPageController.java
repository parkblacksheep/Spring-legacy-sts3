package com.kosta.wedderTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyPageController {
	
	@RequestMapping(value = "/mypage")
	public String mypage() {
		return "jsp/mypage3/mypage";
	}
	@RequestMapping(value="/estimate-storage")
	public String estimateStorage() {
		return "jsp/mypage3/estimateStorage";
	}
	@RequestMapping(value = "/likelist")
	public String likeList() {
		return "jsp/mypage3/likeList";
	}
	@RequestMapping(value="/mypayment")
	public String myPayment() {
		return "jsp/mypage3/myPayment";
	}
	@RequestMapping(value="/payment-detail")
	public String paymentDetail() {
		return "jsp/mypage3/paymentDetail";
	}
	@RequestMapping(value="/reservation-detail")
	public String reservationDetail() {
		return "jsp/mypage3/reservationDetail";
	}
	@RequestMapping(value="/reservation-list")
	public String reservationList() {
		return "jsp/mypage3/reservationList";
	}
	@RequestMapping(value="/wishlist")
	public String wishList() {
		return "jsp/mypage3/wishList";
	}
}
