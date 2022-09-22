package com.gogi.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gogi.finalproject.domain.Criteria;
import com.gogi.finalproject.domain.PageDTO;
import com.gogi.finalproject.domain.QnaVO;
import com.gogi.finalproject.exception.ControllerException;
import com.gogi.finalproject.exception.ServiceException;
import com.gogi.finalproject.service.QnaService;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@RequestMapping("/qna")
@Controller
public class QnaController {

	@Setter(onMethod_= {@Autowired})
	private QnaService service;
	
	
	// ----------------------목록 조회----------------------------
	@GetMapping("/list")
	public void listPerPage(Criteria cri, Model model) throws ControllerException{
		log.trace("listPerPage(cri, model) invoked.");
		
		try {
			List<QnaVO> list = this.service.getListWithPaging(cri);
			model.addAttribute("list", list);
			
			PageDTO pageDTO = new PageDTO(cri, this.service.getTotal());
			model.addAttribute("pageMaker", pageDTO);
			
		} catch (ServiceException e) {
			throw new ControllerException(e);
		}
		
	}
	// ----------------------글쓰기----------------------------
//	@PostMapping("/register")
//	public String register(QnaDTO dto, RedirectAttributes rttrs) throws ControllerException {
//		log.trace("register({}) invoked.", dto);
//		
//		try {			
//			boolean isRegister = this.service.register(dto);
//			log.info("\t+ isRegister: {}", isRegister);
//			
//			// 1. Session Scope 에 아래의 이름과 값으로 바인딩해서 전달(공유)
////			rttrs.addFlashAttribute("result", (isRegister)? "SUCCESS("+dto.getBno()+")" : "FAILURE");
//			
//			// 2. 권장: Get방식의 전송파라미터(즉, Query String 형태로 전달, 예 ?result=FAILURE)
//			rttrs.addAttribute("result", (isRegister)? "SUCCESS("+dto.getBno()+")" : "FAILURE");
//			
//			return "redirect:/board/list";		// Re-direct to the board list.
//		} catch(Exception e) {
//			throw new ControllerException(e);
//		} // try-catch
//	} // register
	
	
	// servlet-context.xml 파일에, <view-controller> 태그로 대체
//	@GetMapping("/register")
//	public void register() {
//		log.trace("register() invoked.");
//		
//	} // register
	
	
//	@PatchMapping("/{QnaId}/modify")
//	public String modify(@PathVariable Integer QnaId , QnaDTO dto, Criteria cri, RedirectAttributes rttrs) throws ControllerException {
//		log.trace("modify({}) invoked.", dto);
//		
//		try {			
//			boolean isModify = this.service.modify(dto);
//			log.info("\t+ isModify: {}", isModify);
//			
//			// 1. Session Scope 에 아래의 이름과 값으로 바인딩해서 전달(공유)
////			rttrs.addFlashAttribute("result", (isModify)? "SUCCESS("+dto.getBno()+")" : "FAILURE");
//			
//			// 2. 권장: Get방식의 전송파라미터(즉, Query String 형태로 전달, 예 ?result=FAILURE)
//			rttrs.addAttribute("result", (isModify)? "SUCCESS("+dto.getBno()+")" : "FAILURE");
//			
//			return "redirect:/board/list?currPage="+cri.getCurrPage();		// Re-direct to the board list.
//		} catch(Exception e) {
//			throw new ControllerException(e);
//		} // try-catch
//	} // modify
	
	
//	@PostMapping("/remove")
//	public String remove(QnaDTO dto, Criteria cri, RedirectAttributes rttrs) throws ControllerException {
//		log.trace("remove({}) invoked.", dto);
//		
//		try {			
//			boolean isRemove = this.service.remove(dto);
//			log.info("\t+ isRemove: {}", isRemove);
//			
//			// 1. Session Scope 에 아래의 이름과 값으로 바인딩해서 전달(공유)
////			rttrs.addFlashAttribute("result", (isModify)? "SUCCESS("+dto.getBno()+")" : "FAILURE");
//			
//			// 2. 권장: Get방식의 전송파라미터(즉, Query String 형태로 전달, 예 ?result=FAILURE)
//			rttrs.addAttribute("result", (isRemove)? "SUCCESS("+dto.getBno()+")" : "FAILURE");
//			
//			return "redirect:/board/list?currPage=" + cri.getCurrPage();		// Re-direct to the board list.
//		} catch(Exception e) {
//			throw new ControllerException(e);
//		} // try-catch
//	} // remove
	
	
	@GetMapping("/{qnaId}")
	public void get(@PathVariable Integer qnaId, Criteria cri, Model model) throws ControllerException {
		log.trace("get({}, {}) invoked.", qnaId, cri);
		
		try {			
			QnaVO vo = this.service.get(qnaId);
			log.info("\t+ vo: {}", vo);
			
			model.addAttribute("qna", vo);
		} catch(Exception e) {
			throw new ControllerException(e);
		} // try-catch
	} // get
	
	

	
	
} // end class
