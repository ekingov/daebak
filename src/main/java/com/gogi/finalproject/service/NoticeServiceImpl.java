package com.gogi.finalproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gogi.finalproject.domain.Criteria;
import com.gogi.finalproject.domain.NoticeVO;
import com.gogi.finalproject.mapper.NoticeMapper;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor

@Service
public class NoticeServiceImpl implements NoticeService {

	@Setter(onMethod_= @Autowired)
	private NoticeMapper mapper;

	
	@Override
	public List<NoticeVO> getList(Criteria cri) throws Exception {
		log.trace("getList() invoked.");
		List<NoticeVO> list = this.mapper.selectAllList(cri);
		
		return list;

	}


	@Override
	public int getTotal() throws Exception {
		log.trace("getTotal() invoked.");
		
		return this.mapper.getTotalCount();
	} // getList

} // end class
