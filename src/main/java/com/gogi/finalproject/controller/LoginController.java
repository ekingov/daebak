package com.gogi.finalproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gogi.finalproject.comm.SharedScopeKeys;
import com.gogi.finalproject.domain.LoginDTO;
import com.gogi.finalproject.domain.UserVO;
import com.gogi.finalproject.service.LoginService;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@RequestMapping("/login/" )
@Controller
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@PostMapping("/into")
	public String login(LoginDTO dto, Model model, RedirectAttributes rttrs) throws Exception {
		log.trace("login() invoked.");
		
		UserVO vo = this.service.findUser(dto);
		
		if(vo != null ) { //로그인 성공
			model.addAttribute(SharedScopeKeys.LOGIN_KEY, vo);
			
			return "/main";
		} else { //로그인 실패
			rttrs.addFlashAttribute(SharedScopeKeys.LOGIN_RESULT, "Login Failed");
		
			return "redirect:/login/intoLogin";
		}//if-else
	}//login
	
	//logout-> interceptor 적용 목적으로만 사용되는 
	@GetMapping("/logout")
	public void dummyLogout() {
		log.trace("dummyLogout() invoked.");
	}//dummyLogout
	
	
	
}//end class
