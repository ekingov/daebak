package com.gogi.finalproject.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.gogi.finalproject.comm.SharedScopeKeys;
import com.gogi.finalproject.domain.UserVO;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@Component
public class LogoutInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
		log.trace("1. preHandle(req, res, {}) invoked.", handler);
		
		HttpSession session = req.getSession();
		log.info("\t+ 1. Session Id: {}", session.getId());
		
		
		UserVO vo = (UserVO) session.getAttribute(SharedScopeKeys.USER_KEY);
		
		session.removeAttribute(SharedScopeKeys.USER_KEY);
		session.invalidate();

		log.info("\t+ 2. Session Destroyed: {}", vo);
		
		req.getSession().setAttribute(SharedScopeKeys.LOGIN_RESULT, "Signed Out Successfully.");
		res.sendRedirect("/user/login");
		
		return false;	
	} // preHandle

	

	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse res, Object handler, ModelAndView modelAndView) throws Exception {
		log.trace("2. postHandle(req, res, {}, {}) invoked.", handler, modelAndView);
		
	} // postHandle

	

	@Override
	public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object handler, Exception e) throws Exception {
		log.trace("3. afterCompletion(req, res, {}, {}) invoked.", handler, e);


		
		
	} // afterCompletion
	
}//end class
