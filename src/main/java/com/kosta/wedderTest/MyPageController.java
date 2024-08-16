package com.kosta.wedderTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyPageController {
	
	@RequestMapping(value = "/mypage")
	public String mypage() {
		return "jsp/myPage/mypage";
	}
	@RequestMapping(value="/estimate-storage")
	public String estimateStorage() {
		return "jsp/myPage/estimateStorage";
	}
	@RequestMapping(value = "/likelist")
	public String likeList() {
		return "jsp/myPage/likeList";
	}
	@RequestMapping(value="/mypayment")
	public String myPayment() {
		return "jsp/myPage/myPayment";
	}
	@RequestMapping(value="/payment-detail")
	public String paymentDetail() {
		return "jsp/myPage/paymentDetail";
	}
	@RequestMapping(value="/reservation-detail")
	public String reservationDetail() {
		return "jsp/myPage/reservationDetail";
	}
	@RequestMapping(value="/reservation-list")
	public String reservationList() {
		return "jsp/myPage/reservationList";
	}
	@RequestMapping(value="/wishlist")
	public String wishList() {
		return "jsp/myPage/wishList";
	}
}
