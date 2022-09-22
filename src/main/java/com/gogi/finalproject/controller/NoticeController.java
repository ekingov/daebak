package com.gogi.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gogi.finalproject.domain.Criteria;
import com.gogi.finalproject.domain.NoticeVO;
import com.gogi.finalproject.domain.PageDTO;
import com.gogi.finalproject.service.NoticeService;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor

@RequestMapping("/notice/")
@Controller
public class NoticeController {
	
	@Autowired
	private NoticeService service;

	@GetMapping("/list")
	public void listPerPage(Criteria cri, Model model) throws Exception {
		log.trace("list() invoked.");
		
		List<NoticeVO> list = this.service.getList(cri);
		model.addAttribute("list", list);
		
		PageDTO pageDTO = new PageDTO(cri, this.service.getTotal());
		model.addAttribute("pageMaker", pageDTO);


	}

} // end class
