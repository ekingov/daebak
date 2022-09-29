package com.gogi.finalproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gogi.finalproject.domain.Criteria;
import com.gogi.finalproject.domain.SellerProductDTO;
import com.gogi.finalproject.domain.SellerProductVO;
import com.gogi.finalproject.exception.DAOException;
import com.gogi.finalproject.exception.ServiceException;
import com.gogi.finalproject.mapper.SellerProductMapper;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@Service
public class SellerProductServiceImpl implements SellerProductService{

	@Setter(onMethod_= {@Autowired})
	private SellerProductMapper mapper;

	@Override
	public List<SellerProductVO> getListWithPaging(Criteria cri) throws ServiceException {
		log.trace("getListWithPaging(cri) invoked.");
		try {
			return this.mapper.selectListWithPaging(cri);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public Integer getTotal() throws ServiceException {
		log.trace("getTotal() invoked.");
		try {
			return this.mapper.getTotalCount();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public SellerProductVO get(Integer ProductNum) throws ServiceException {
		log.trace("get(qnaId) invoked.");
		try {
			return this.mapper.select(ProductNum);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}
	
	@Override
	public boolean register(SellerProductDTO dto) throws ServiceException {
		log.trace("register({}) invoked.", dto);
		
		// 핵심 비지니스 로직 구현
		try {
//			return this.mapper.insert(dto) == 1;
			return this.mapper.insertSelectKey(dto) == 1;
		} catch(Exception e) {
			throw new ServiceException(e);
		} // try-catch
	} // register
	
	@Override
	public boolean modify(SellerProductDTO dto) throws ServiceException {
		log.trace("modify({}) invoked.", dto);
		
		// 핵심 비지니스 로직 구현
		try {
			return this.mapper.update(dto) == 1;
		} catch(Exception e) {
			throw new ServiceException(e);
		} // try-catch
	} // modify

	@Override
	public boolean remove(SellerProductDTO dto) throws ServiceException {
		log.trace("remove({}) invoked.", dto);
		
		// 핵심 비지니스 로직 구현
		try {
			return this.mapper.delete(dto.getProductNum()) == 1;
		} catch(Exception e) {
			throw new ServiceException(e);
		} // try-catch
	} // remove
	
	
	
	
} // end class
