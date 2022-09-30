package com.gogi.finalproject.mapper;

import java.util.List;

import com.gogi.finalproject.domain.Criteria;
import com.gogi.finalproject.domain.FaqDTO;
import com.gogi.finalproject.domain.FaqVO;
import com.gogi.finalproject.exception.DAOException;

public interface FaqMapper {
	
	// 1. 게시판 테이블의 전체 목록 조회하기
	public abstract List<FaqVO> selectAllList(Criteria cri) throws DAOException;

	// 2. 총 게시물의 개수를 반환
	public abstract Integer getTotalCount() throws DAOException;

	// 3. 1개의 게시글 조회
	public abstract FaqVO selectListOne(FaqDTO dto) throws DAOException;
	
	// 4. 게시글 작성
	public abstract Integer register(FaqDTO dto) throws DAOException;
		
} // end interface
