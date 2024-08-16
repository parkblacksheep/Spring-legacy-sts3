package com.kosta.wedderTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SDMController {
	
	@RequestMapping(value = "studio-list")
	public String studioList() {
		return "jsp/sdm/studioList";
	}
	@RequestMapping(value = "studio-detail")
	public String studioDetail() {
		return "jsp/sdm/studioDetail";
	}
	@RequestMapping(value = "dress-list")
	public String dressList() {
		return "jsp/sdm/dressList";
	}
	@RequestMapping(value = "dress-detail")
	public String dressDetail() {
		return "jsp/sdm/dressDetail";
	}
	@RequestMapping(value = "makeup-list")
	public String makeupList() {
		return "jsp/sdm/makeupList";
	}
	@RequestMapping(value = "makeup-detail")
	public String makeupDetail() {
		return "jsp/sdm/makeupDetail";
	}

}
