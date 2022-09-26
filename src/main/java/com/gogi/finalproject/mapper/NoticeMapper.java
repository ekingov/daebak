package com.gogi.finalproject.mapper;

import java.util.List;

import com.gogi.finalproject.domain.Criteria;
import com.gogi.finalproject.domain.NoticeDTO;
import com.gogi.finalproject.domain.NoticeVO;
import com.gogi.finalproject.exception.DAOException;

public interface NoticeMapper {
	
	// 1. 게시판 테이블의 전체 목록 조회하기
	public abstract List<NoticeVO> selectAllList(Criteria cri) throws DAOException;

	// 2. 총 게시물의 개수를 반환
	public abstract Integer getTotalCount() throws DAOException;

	// 3. 1개의 게시글 조회
	public abstract NoticeVO selectListOne(NoticeDTO dto) throws DAOException;
	
	// 4. 게시글 작성
	public abstract Integer register(NoticeDTO dto) throws DAOException;
		
} // end interface
