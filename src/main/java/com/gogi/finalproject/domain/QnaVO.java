package com.gogi.finalproject.domain;

import java.util.Date;

import lombok.Value;


@Value
public class QnaVO {

	private Integer id;
	private String title;
	private String category;
	private String content;
	private Date regDate;
	private Date modDate;
	private Integer UserNum;
	private Integer AdminNum;
	private Integer AnswerCheck;
	
} // end class
