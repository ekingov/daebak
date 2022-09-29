package com.gogi.finalproject.service;

import com.gogi.finalproject.domain.LoginDTO;
import com.gogi.finalproject.domain.UserVO;

public interface LoginService {

	public abstract UserVO findUser(LoginDTO dto) throws Exception;
}// end interface
