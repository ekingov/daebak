package com.gogi.finalproject.persistence;

import com.gogi.finalproject.domain.LoginDTO;
import com.gogi.finalproject.domain.UserVO;

public interface UserDAO {

	public abstract UserVO selectUser(LoginDTO dto) throws Exception;
}//end interface

