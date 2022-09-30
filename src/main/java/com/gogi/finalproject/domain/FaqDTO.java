package com.gogi.finalproject.domain;

import java.util.Date;

import lombok.Data;


@Data
public class FaqDTO {
	private Integer faqNum;
	private String title;
	private String content;
	private Date registerDate;
	private String writer;

} // end class
