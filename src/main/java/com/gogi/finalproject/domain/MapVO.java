package com.gogi.finalproject.domain;

import java.sql.Timestamp;
import java.util.Date;

import lombok.Value;


@Value
public class MapVO {
	private Integer noticeNum;
	private String title;
	private String content;
	private Date registerDate;
	private Date modifiedDate;
	private Date deleteDate;
	private String img;
	
} // end class
