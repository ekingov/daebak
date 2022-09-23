package com.gogi.finalproject.service;

import java.util.List;

import com.gogi.finalproject.domain.Criteria;
import com.gogi.finalproject.domain.NoticeDTO;
import com.gogi.finalproject.domain.NoticeVO;
import com.gogi.finalproject.exception.ServiceException;

public interface NoticeService {
	// 1. 게시글 전체목록 획득(게시글번호의 역순으로...)
	public abstract List<NoticeVO> getList(Criteria cri) throws ServiceException;

	// 2. 총 게시물 개수 조회
	public abstract int getTotal() throws ServiceException;
	
	// 3. 게시물 상세 조회
	public abstract NoticeVO getNotice(NoticeDTO dto) throws ServiceException;

} // end interface
