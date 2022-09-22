package com.gogi.finalproject.service;

import java.util.List;

import com.gogi.finalproject.domain.Criteria;
import com.gogi.finalproject.domain.SellerProductVO;
import com.gogi.finalproject.exception.ServiceException;

public interface SellerProductService {

	public abstract List<SellerProductVO> getListWithPaging(Criteria cri) throws ServiceException;
	
	public abstract Integer getTotal() throws ServiceException;
	
	public abstract SellerProductVO get(Integer ProductNum) throws ServiceException;
} // end interface
