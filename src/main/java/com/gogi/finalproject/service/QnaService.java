package com.gogi.finalproject.service;

import java.util.List;

import com.gogi.finalproject.domain.Criteria;
import com.gogi.finalproject.domain.QnaDTO;
import com.gogi.finalproject.domain.QnaVO;
import com.gogi.finalproject.exception.ServiceException;

public interface QnaService {

	public abstract List<QnaVO> getListWithPaging(Criteria cri) throws ServiceException;
	
	public abstract Integer getTotal() throws ServiceException;
	
	public abstract QnaVO getQna(QnaDTO dto) throws ServiceException;
	
	public abstract boolean register(QnaDTO dto) throws ServiceException;
	} // end interface
