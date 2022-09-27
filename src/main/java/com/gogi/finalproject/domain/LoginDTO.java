package com.gogi.finalproject.domain;

import lombok.Data;

@Data
public class LoginDTO {
	private String userid;
	private String userpw;
	
	private Boolean rememberMe;
	
	
}//END CLASS
