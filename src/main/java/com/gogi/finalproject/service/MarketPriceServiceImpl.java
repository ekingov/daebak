package com.gogi.finalproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gogi.finalproject.exception.ServiceException;
import com.gogi.finalproject.mapper.MarketPriceMapper;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Log4j2
@NoArgsConstructor

@Service
public class MarketPriceServiceImpl implements MarketPriceService {
    
    @Autowired
    private MarketPriceMapper mapper;

    @Override
    public void select() throws ServiceException {

    }

}
