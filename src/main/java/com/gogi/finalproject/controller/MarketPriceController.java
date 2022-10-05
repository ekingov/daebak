//package com.gogi.finalproject.controller;
//
//import java.io.IOException;
//import java.text.ParseException;
//import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.gogi.finalproject.domain.MarketPriceVO;
//import com.gogi.finalproject.exception.ControllerException;
//import com.gogi.finalproject.service.MarketPriceService;
//
//import lombok.NoArgsConstructor;
//import lombok.extern.log4j.Log4j2;
//
//
//@Log4j2
//@NoArgsConstructor
//
//@RequestMapping("/marketPrice/")
//@Controller
//public class MarketPriceController {
//	
//	@Autowired
//	private MarketPriceService service;
//	
//	@GetMapping("select")
//	public void select() throws ControllerException {
//	    log.trace("select() invoked.");
//	    
//	} // select
//	
//	
//	@ResponseBody
//	  @RequestMapping("/setDirectoryList_ajax.do")
//	  public void getDirList_ajax(  MarketPriceVO paramVO 
//	                                , HttpServletRequest req
//	                                , HttpServletResponse res
//	                                , HttpSession session) throws ParseException, IOException{
//	        int level = Integer.parseInt(paramVO.getSelectVal());
//	        JSONObject json = new JSONObject();
//	        int resultNum = 0;
//	        
//	    
//	        if(level < 5 || (paramVO.getSelectVal().equals("09") && level < 7 )){   
//	            
//	            //db에서 해당 값을 가져와 json형식으로 만들어주는 코드가 필요.
//	            List<MarketPriceVO> resultDirList = setDirList(resultCnt, resultList);
//	            long resultCnt = resultDirList.size();
//
//	            resultNum = 1; 
//	            
//	            json.put("resultCnt", resultCnt);
//	            json.put("resultJList",resultList);
//	            
//	        }
//	        json.put("result", resultNum); 
//	        res.setContentType("application/json; charset=utf-8");
//	        res.getWriter().write(json.toString());
//	        
//	  }
//
//
//
//} // end class
