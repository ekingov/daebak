package com.gogi.finalproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@RequestMapping("/gogiwiki/")
@Controller
public class GogiwikiController {

	@GetMapping("/view")
	public void gogiwikiHandler() {
		log.info("고기 위키 페이지입니다.");
	}
	
	@GetMapping("/cow")
	public void cowHandler() {
		log.info("소 선택입니다.");
	}
	
	@GetMapping("/pig")
	public void pigHandler() {
		log.info("돼지 선택입니다.");
	}
	
	@GetMapping("/part1")
	public void dummyHandler() {
		log.info("소 선택입니다.");
	}
	
	@GetMapping("/part2")
	public void dummy2Handler() {
		log.info("돼지 선택입니다.");
	}
	
	
	
} // end class
