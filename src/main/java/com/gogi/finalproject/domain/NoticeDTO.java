package com.gogi.finalproject.domain;

import java.util.Date;

import lombok.Data;


@Data
public class NoticeDTO {
	private Integer noticeNum;
	private String title;
	private String content;
	private String img;
	private Date registerDate;

} // end class
