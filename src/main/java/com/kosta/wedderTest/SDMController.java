package com.kosta.wedderTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SDMController {
	
	@RequestMapping(value = "studio-list")
	public String studioList() {
		return "jsp/company/studioList";
	}
	@RequestMapping(value = "studio-detail")
	public String studioDetail() {
		return "jsp/company/studioDetail";
	}
	@RequestMapping(value = "dress-list")
	public String dressList() {
		return "jsp/company/dressList";
	}
	@RequestMapping(value = "dress-detail")
	public String dressDetail() {
		return "jsp/company/dressDetail";
	}
	@RequestMapping(value = "makeup-list")
	public String makeupList() {
		return "jsp/company/makeupList";
	}
	@RequestMapping(value = "makeup-detail")
	public String makeupDetail() {
		return "jsp/company/makeupDetail";
	}

}
