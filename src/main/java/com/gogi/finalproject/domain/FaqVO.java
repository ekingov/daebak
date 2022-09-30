package com.gogi.finalproject.domain;

import java.util.Date;

import lombok.Value;


@Value
public class FaqVO {

	private Integer faqNum;
	private String title;
	private String content;
	private Date registerDate;
	private Date modifiedDate;
	private String writer;
} // end class
