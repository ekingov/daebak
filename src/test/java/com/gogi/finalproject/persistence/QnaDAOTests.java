package com.gogi.finalproject.persistence;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.gogi.finalproject.domain.Criteria;
import com.gogi.finalproject.domain.QnaVO;
import com.gogi.finalproject.exception.DAOException;
import com.gogi.finalproject.mapper.QnaMapper;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/root-context.xml")

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class QnaDAOTests {

	@Setter(onMethod_= {@Autowired})
	private QnaMapper mapper;
	
	
	@Test
	public void testQnaDAO() throws DAOException {
		log.trace("testQnaDAO() invoked.");
		
		Criteria cri = new Criteria();
		cri.setCurrPage(1);
		cri.setAmount(10);
		
		List<QnaVO> list = this.mapper.selectListWithPaging(cri);
		
		list.forEach(log::info);
	}
	
}
