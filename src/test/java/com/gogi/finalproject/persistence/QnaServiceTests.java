package com.gogi.finalproject.persistence;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.gogi.finalproject.domain.Criteria;
import com.gogi.finalproject.domain.QnaDTO;
import com.gogi.finalproject.domain.QnaVO;
import com.gogi.finalproject.exception.ServiceException;
import com.gogi.finalproject.service.QnaService;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/root-context.xml")

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class QnaServiceTests {

	@Setter(onMethod_= {@Autowired})
	private QnaService service;
	
//	@Disabled
	@Test
	@Order(1)
	@DisplayName("1. testQnaGetList::")
	@Timeout(unit = TimeUnit.SECONDS, value = 300)
	public void testQnaGetList() throws ServiceException {
		log.trace("testQnaGetList() invoked.");
		
		Criteria cri = new Criteria();
		cri.setAmount(10);
		cri.setCurrPage(1);
		
		List<QnaVO> list = this.service.getListWithPaging(cri);
		list.forEach(log::info);
		
		int totalCount = this.service.getTotal();
		log.info("totalCount: {}", totalCount);
		
	} // testQnaGetList
	
//	@Disabled
	@Test
	@Order(2)
	@DisplayName("2. testQnaGetQna::")
	@Timeout(unit = TimeUnit.SECONDS, value = 300)
	public void testQnaGetQna() throws ServiceException {
		log.trace("testQnaGetQna() invoked.");
		
		QnaDTO dto = new QnaDTO();
		dto.setQnaNum(1);
		
		QnaVO vo = this.service.getQna(dto);
		log.info("vo: {}", vo);
	} // testQnaGetQna
	
//	@Disabled
	@Test
	@Order(3)
	@DisplayName("3. testQnaRegister::")
	@Timeout(unit = TimeUnit.SECONDS, value = 300)
	public void testQnaRegister() throws ServiceException {
		log.trace("testQnaRegister() invoked.");
		
		QnaDTO dto = new QnaDTO();
		dto.setTitle("Qna_Title");
		dto.setContent("Qna_Content");
		dto.setQnaCategory("Qna_Category_1");
		dto.setAnswerCheck(1);
		dto.setIsSecret(1);

		
		boolean isRegister = this.service.register(dto);
		log.info("isRegister: {}", isRegister);
	} // testQnaRegister
	
} // end class