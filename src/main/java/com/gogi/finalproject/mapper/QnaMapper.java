package com.gogi.finalproject.mapper;

import java.util.List;

import com.gogi.finalproject.domain.Criteria;
import com.gogi.finalproject.domain.NoticeVO;
import com.gogi.finalproject.domain.QnaDTO;
import com.gogi.finalproject.domain.QnaVO;
import com.gogi.finalproject.exception.DAOException;

public interface QnaMapper {
	
	// 1. 게시판 테이블의 전체 목록 조회하기
	public abstract List<QnaVO> selectAllList(Criteria cri) throws DAOException;

	// 2. 총 게시물의 개수를 반환
	public abstract Integer getTotalCount() throws DAOException;

	// 3. 1개의 게시글 조회
	public abstract QnaVO select(QnaDTO dto) throws DAOException;
	
	// 4. 게시글 작성
	public abstract Integer register(QnaDTO dto) throws DAOException;
		
} // end interface
