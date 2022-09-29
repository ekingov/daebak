package com.gogi.finalproject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import com.gogi.finalproject.domain.Criteria;
import com.gogi.finalproject.domain.SellerProductDTO;
import com.gogi.finalproject.domain.SellerProductVO;
import com.gogi.finalproject.exception.DAOException;

public interface SellerProductMapper {
	
	public abstract List<SellerProductVO> selectListWithPaging(Criteria cri) throws DAOException;
	
	public abstract Integer getTotalCount() throws DAOException;
	
	// 2. 새로운 게시글을 등록하기(CREATE) - Mapper XML 파일로 처리
	public abstract Integer insert(SellerProductDTO dto) throws DAOException;
	public abstract Integer insertSelectKey(SellerProductDTO dto) throws DAOException;		// *** : 새로이 입력된 게시글의 no를 반환받기를 원하는 경우
	
	// 3. 기존 게시글 상세조회 하기(READ) - Mapper XML 파일로 처리
	public abstract SellerProductVO select(Integer ProductNum) throws DAOException;
	
	// 4. 기존 게시글 수정하기(UPDATE) - Mapper XML 파일로 처리
	public abstract Integer update(SellerProductDTO dto) throws DAOException;
	
	// 5. 기존 게시글 삭제하기(DELETE)
	@Delete("DELETE FROM product1 WHERE product_num = #{ProductNum}")
	public abstract Integer delete(@Param("ProductNum") Integer ProductNum) throws DAOException;

	
} // end interface
