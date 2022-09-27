package com.gogi.finalproject.service;

import org.springframework.stereotype.Service;

import com.gogi.finalproject.domain.LoginDTO;
import com.gogi.finalproject.domain.UserVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@AllArgsConstructor

@Service
public class LoginServiceImpl implements LoginService {
	
	@Override
	public UserVO findUser(LoginDTO dto) throws Exception {
		log.trace("findUser({}) invoked.", dto);
		
		return null;
	}//findUser

}
