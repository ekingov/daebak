package com.gogi.finalproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@Controller
public class MainController {

	@GetMapping("/main")
	public void mainHandler() {
		log.info("메인 화면입니다.");
	}//
	
} // end class
