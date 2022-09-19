package com.gogi.finalproject.service;

import java.util.List;

import com.gogi.finalproject.domain.Criteria;
import com.gogi.finalproject.domain.QnaVO;
import com.gogi.finalproject.exception.ServiceException;

public interface QnaService {

	public abstract List<QnaVO> getListWithPaging(Criteria cri) throws ServiceException;
	
	public abstract Integer getTotal() throws ServiceException;
	
	public abstract QnaVO get(Integer qnaId) throws ServiceException;
} // end interface
