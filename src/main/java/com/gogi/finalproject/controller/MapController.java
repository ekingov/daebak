package com.gogi.finalproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@RequestMapping("/map/")
@Controller
public class MapController {

	@GetMapping("/view")
	public void mapviewHandler() {
		log.info("지도 조회 페이지입니다.");
	}
	
	
	
} // end class
