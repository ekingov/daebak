package com.gogi.finalproject.service;

import java.util.List;

import com.gogi.finalproject.domain.Criteria;
import com.gogi.finalproject.domain.FaqDTO;
import com.gogi.finalproject.domain.FaqVO;
import com.gogi.finalproject.exception.ServiceException;

public interface FaqService {
	// 1. 게시글 전체목록 획득(게시글번호의 역순으로...)
	public abstract List<FaqVO> getList(Criteria cri) throws ServiceException;

	// 2. 총 게시물 개수 조회
	public abstract int getTotal() throws ServiceException;
	
	// 3. 게시물 상세 조회
	public abstract FaqVO getFaq(FaqDTO dto) throws ServiceException;

	// 4. 게시물 등록
	public abstract boolean register(FaqDTO dto) throws ServiceException;
	
} // end interface
