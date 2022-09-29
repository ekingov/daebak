package com.gogi.finalproject.domain;

import java.util.Date;

import lombok.Data;

@Data
public class QnaDTO {
	private Integer qnaNum;
	private String title;
	private String qnaCategory;
	private String content;
	private Integer userNum;
	private Integer answerCheck;
	private Integer isSecret;
	private Date registerDate;
}
