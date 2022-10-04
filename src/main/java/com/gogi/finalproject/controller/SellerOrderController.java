package com.gogi.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gogi.finalproject.domain.Criteria;
import com.gogi.finalproject.domain.PageDTO;
import com.gogi.finalproject.domain.SellerProductDTO;
import com.gogi.finalproject.domain.SellerProductVO;
import com.gogi.finalproject.exception.ControllerException;
import com.gogi.finalproject.exception.ServiceException;
import com.gogi.finalproject.service.SellerProductService;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@RequestMapping("/seller_order")
@Controller
public class SellerOrderController {

	@Setter(onMethod_= {@Autowired})
	private SellerProductService service;
	
	
	// ----------------------목록 조회----------------------------
	@GetMapping
	public void listPerPage(Criteria cri, Model model) throws ControllerException{
		log.trace("listPerPage(cri, model) invoked.");
		
		try {
			List<SellerProductVO> list = this.service.getListWithPaging(cri);
			model.addAttribute("list", list);
			
			PageDTO pageDTO = new PageDTO(cri, this.service.getTotal());
			model.addAttribute("pageMaker", pageDTO);
			
		} catch (ServiceException e) {
			throw new ControllerException(e);
		}
		
	}
	// ----------------------상품 추가----------------------------
	@GetMapping("/new")
	public void registerPage() {
		log.trace("register() invoked.");
	} // registerPage
	
	
	@PostMapping("/register")
	public String register(SellerProductDTO dto, RedirectAttributes rttrs) throws ControllerException {
		log.trace("register({}) invoked.", dto);
		
		try {			
			boolean isRegister = this.service.register(dto);
			log.info("\t+ isRegister: {}", isRegister);
			
			// 1. Session Scope 에 아래의 이름과 값으로 바인딩해서 전달(공유)
//			rttrs.addFlashAttribute("result", (isRegister)? "SUCCESS("+dto.getBno()+")" : "FAILURE");
			
			// 2. 권장: Get방식의 전송파라미터(즉, Query String 형태로 전달, 예 ?result=FAILURE)
			rttrs.addAttribute("result", (isRegister)? "SUCCESS("+dto.getProductNum()+")" : "FAILURE");
			
			return "redirect:/seller_product";		// Re-direct to the board list.
		} catch(Exception e) {
			throw new ControllerException(e);
		} // try-catch
	} // register
	
	
	// servlet-context.xml 파일에, <view-controller> 태그로 대체
//	@GetMapping("/register")
//	public void register() {
//		log.trace("register() invoked.");
//		
//	} // register
	
	
	@PatchMapping("/{ProductNum}/modify")
	public String modify(@PathVariable Integer ProductNum , SellerProductDTO dto, Criteria cri, RedirectAttributes rttrs) throws ControllerException {
		log.trace("modify({}) invoked.", dto);
		
		try {			
			boolean isModify = this.service.modify(dto);
			log.info("\t+ isModify: {}", isModify);
			
			// 1. Session Scope 에 아래의 이름과 값으로 바인딩해서 전달(공유)
//			rttrs.addFlashAttribute("result", (isModify)? "SUCCESS("+dto.getBno()+")" : "FAILURE");
			
			// 2. 권장: Get방식의 전송파라미터(즉, Query String 형태로 전달, 예 ?result=FAILURE)
			rttrs.addAttribute("result", (isModify)? "SUCCESS("+dto.getProductNum()+")" : "FAILURE");
			
			return "redirect:/seller_product?currPage="+cri.getCurrPage();		// Re-direct to the board list.
		} catch(Exception e) {
			throw new ControllerException(e);
		} // try-catch
	} // modify
	
	
	@GetMapping("/{ProductNum}/remove")
	public String remove(SellerProductDTO dto, Criteria cri, RedirectAttributes rttrs) throws ControllerException {
		log.trace("remove({}) invoked.", dto);
		
		try {			
			boolean isRemove = this.service.remove(dto);
			log.info("\t+ isRemove: {}", isRemove);
			
			
			// 2. 권장: Get방식의 전송파라미터(즉, Query String 형태로 전달, 예 ?result=FAILURE)
			rttrs.addAttribute("result", (isRemove)? "SUCCESS("+dto.getProductNum()+")" : "FAILURE");
			
			return "redirect:/seller_product?currPage=" + cri.getCurrPage();		// Re-direct to the board list.
		} catch(Exception e) {
			throw new ControllerException(e);
		} // try-catch
	} // remove
	
	
	@GetMapping("/{ProductNum}/modify")
	public void get(@PathVariable Integer ProductNum, Criteria cri, Model model) throws ControllerException {
		log.trace("get({}, {}) invoked.", ProductNum, cri);
		
		try {			
			SellerProductVO vo = this.service.get(ProductNum);
			log.info("\t+ vo: {}", vo);
			
			model.addAttribute("qna", vo);
		} catch(Exception e) {
			throw new ControllerException(e);
		} // try-catch
	} // get
	
	

	
	
} // end class
