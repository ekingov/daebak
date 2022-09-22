package com.gogi.finalproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@Controller
public class SellerController {

	@GetMapping("/seller_home")
	public void sellerHandler() {
		log.info("셀러 메인입니다.");
	}
	
} // end class
