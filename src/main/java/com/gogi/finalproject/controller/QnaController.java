package com.gogi.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gogi.finalproject.domain.Criteria;
import com.gogi.finalproject.domain.NoticeDTO;
import com.gogi.finalproject.domain.NoticeVO;
import com.gogi.finalproject.domain.PageDTO;
import com.gogi.finalproject.domain.QnaDTO;
import com.gogi.finalproject.domain.QnaVO;
import com.gogi.finalproject.exception.ControllerException;
import com.gogi.finalproject.exception.ServiceException;
import com.gogi.finalproject.service.QnaService;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor

@RequestMapping("/qna")
@Controller
public class QnaController {
	
	@Autowired
	private QnaService service;

	@GetMapping("/list")
	public void listPerPage(Criteria cri, Model model) throws ControllerException {
		log.trace("list() invoked.");
		
		try {
			List<QnaVO> list = this.service.getListWithPaging(cri);
			model.addAttribute("list", list);
			
			PageDTO pageDTO = new PageDTO(cri, this.service.getTotal());
			model.addAttribute("pageMaker", pageDTO);
		} catch (ServiceException e) {
			throw new ControllerException(e);
		}

	} // listPerPage
	
	@GetMapping("/getQna")
	public void getQna(QnaDTO dto, Model model) throws ControllerException {
		log.trace("getQna({}, {}) invoked.", dto, model);
		
		try {
			QnaVO vo = this.service.getQna(dto);
			
			model.addAttribute("qna", vo);
		} catch(Exception e) {
			throw new ControllerException(e);
		}
		
	} // getQna
	
	@GetMapping("/new")
	public void registerPage() {
		log.trace("register() invoked.");
	} // registerPage
	
	@PostMapping("/register")
	public String register(QnaDTO dto, RedirectAttributes rttrs) throws ControllerException {
		log.trace("register() invoked.");
		
		try {
			boolean isRegister = this.service.register(dto);

			rttrs.addAttribute("result", (isRegister)? "작성완료" : "잠시 후 다시 시도해주세요.");			

			return "redirect:/qna/list";
		} catch (Exception e) {
			throw new ControllerException(e);
		}
	} // register

} // end class
