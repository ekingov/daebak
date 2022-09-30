package com.gogi.finalproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gogi.finalproject.domain.Criteria;
import com.gogi.finalproject.domain.FaqDTO;
import com.gogi.finalproject.domain.FaqVO;
import com.gogi.finalproject.exception.DAOException;
import com.gogi.finalproject.exception.ServiceException;
import com.gogi.finalproject.mapper.FaqMapper;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor

@Service
public class FaqServiceImpl implements FaqService {

	@Setter(onMethod_= @Autowired)
	private FaqMapper mapper;

	
	@Override
	public List<FaqVO> getList(Criteria cri) throws ServiceException {
		log.trace("getList({}) invoked.", cri);
		try {
			List<FaqVO> list = this.mapper.selectAllList(cri);
			
			return list;
		} catch (DAOException e) {
			throw new ServiceException(e);
		}

	} // getList


	@Override
	public int getTotal() throws ServiceException {
		log.trace("getTotal() invoked.");
		
		try {
			return this.mapper.getTotalCount();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}


	@Override
	public FaqVO getFaq(FaqDTO dto) throws ServiceException {
		log.trace("getFaq({}) invoked.", dto);

		try {
			return this.mapper.selectListOne(dto);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	} // getTotal


	@Override
	public boolean register(FaqDTO dto) throws ServiceException {
		log.trace("register({}) invoked.", dto);

		try {
			return this.mapper.register(dto) == 1;
		} catch(Exception e) {
			throw new ServiceException(e);
		}
	} // resigter

} // end class
