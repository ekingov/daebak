package com.gogi.finalproject.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.gogi.finalproject.comm.SharedScopeKeys;
import com.gogi.finalproject.domain.UserVO;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@Component
public class LoginInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
		log.trace("1. preHandle(req, res, {}) invoked.", handler);

		HttpSession session = req.getSession();
		log.info("\t+ 1. session Id: {}", session.getId());
		

		session.removeAttribute(SharedScopeKeys.USER_KEY);
		log.info("\t+ 2. UserVO shared object deleted.");
		
		return true;
	} // preHandle

	
	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse res, Object handler, ModelAndView modelAndView) throws Exception {
		log.trace("2. postHandle(req, res, {}, {}) invoked.", handler, modelAndView);
	
		

		HttpSession session = req.getSession();
		log.info("\t+ 1. session Id: {}", session.getId());
		

		ModelMap model = modelAndView.getModelMap();
		UserVO vo = (UserVO) model.get(SharedScopeKeys.LOGIN_KEY);
		
		if(vo != null) { // 로그인 성공
			session.setAttribute(SharedScopeKeys.USER_KEY, vo);
			log.info("\t+ 2. Authentication Succeed.");
			
		} // if
	} // postHandle

	@Override
	public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object handler, Exception e) throws Exception {
		log.trace("3. afterCompletion(req, res, {}, {}) invoked.", handler, e);
	
		
		
	} // afterCompletion	

}// end class
