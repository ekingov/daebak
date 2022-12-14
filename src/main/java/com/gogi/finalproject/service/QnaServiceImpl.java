package com.gogi.finalproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gogi.finalproject.domain.Criteria;
import com.gogi.finalproject.domain.QnaDTO;
import com.gogi.finalproject.domain.QnaVO;
import com.gogi.finalproject.exception.DAOException;
import com.gogi.finalproject.exception.ServiceException;
import com.gogi.finalproject.mapper.QnaMapper;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@Service
public class QnaServiceImpl implements QnaService{

	@Setter(onMethod_= {@Autowired})
	private QnaMapper mapper;

	@Override
	public List<QnaVO> getListWithPaging(Criteria cri) throws ServiceException {
		log.trace("getListWithPaging(cri) invoked.");
		try {
			return this.mapper.selectAllList(cri);
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
	public QnaVO getQna(QnaDTO dto) throws ServiceException {
		log.trace("getQna({}) invoked.", dto);
		
		try {
			return this.mapper.select(dto);
		} catch (Exception e) {
			throw new ServiceException(e);
		}

	}

	@Override
	public boolean register(QnaDTO dto) throws ServiceException {
		log.trace("register({}) invoked.", dto);
		
		try {
			return this.mapper.register(dto) == 1;
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}
	
	
} // end class
