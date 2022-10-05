package com.gogi.finalproject.domain;

import lombok.Data;


@Data
public class MarketPriceDTO {
    private String meatType;
    private String area;
    private String meatPart;
    private Integer price;

}
