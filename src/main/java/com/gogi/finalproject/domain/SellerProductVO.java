package com.gogi.finalproject.domain;


import lombok.Value;


@Value
public class SellerProductVO {

	private Integer productNum;
	private String origin;
	private String unit;
	private String meatType;
	private String meatPart;
	private String productName;
	private Integer productPrice;
	private Integer storeId;

} // end class
