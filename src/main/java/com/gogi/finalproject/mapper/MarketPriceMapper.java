package com.gogi.finalproject.mapper;

import com.gogi.finalproject.exception.DAOException;

public interface MarketPriceMapper {
    public abstract void selectAll() throws DAOException;
}
