package com.gogi.finalproject.domain;

import java.util.Date;

import lombok.Value;


@Value
public class MarketPriceVO {
    private Integer marketPriceNum;
    private Integer adminNum;
    private String meatType;
    private String area;
    private String meatPart;
    private Integer price;
    private Date registerDate;
    private Date modifiedDate;
    private Date deleteDate;
}
