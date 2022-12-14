package com.gogi.finalproject.service;

import java.util.List;

import com.gogi.finalproject.domain.Criteria;
import com.gogi.finalproject.domain.SellerProductDTO;
import com.gogi.finalproject.domain.SellerProductVO;
import com.gogi.finalproject.exception.ServiceException;

public interface SellerProductService {

	public abstract List<SellerProductVO> getListWithPaging(Criteria cri) throws ServiceException;
	
	public abstract Integer getTotal() throws ServiceException;
	
	public abstract SellerProductVO get(Integer ProductNum) throws ServiceException;
	
	public abstract boolean register(SellerProductDTO dto) throws ServiceException;
	
	
	public abstract boolean modify(SellerProductDTO dto) throws ServiceException;
	

	public abstract boolean remove(SellerProductDTO dto) throws ServiceException;
} // end interface
