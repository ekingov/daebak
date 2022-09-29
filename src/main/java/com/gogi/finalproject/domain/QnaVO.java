package com.gogi.finalproject.domain;

import java.util.Date;

import lombok.Value;


@Value
public class QnaVO {
	private Integer qnaNum;
	private String title;
	private String qnaCategory;
	private String content;
	private Date registerDate;
	private Date modifiedDate;
	private Integer userNum;
	private Integer adminNum;
	private Integer answerCheck;
	
} // end class
