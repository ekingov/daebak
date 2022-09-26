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
import com.gogi.finalproject.domain.NoticeDTO;
import com.gogi.finalproject.domain.NoticeVO;
import com.gogi.finalproject.exception.ServiceException;
import com.gogi.finalproject.service.NoticeService;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/root-context.xml")

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class NoticeServiceTests {

	@Setter(onMethod_= {@Autowired})
	private NoticeService service;
	
//	@Disabled
	@Test
	@Order(1)
	@DisplayName("1. testNoticeGetList::")
	@Timeout(unit = TimeUnit.SECONDS, value = 300)
	public void testNoticeGetList() throws ServiceException {
		log.trace("testNoticeGetList() invoked.");
		
		Criteria cri = new Criteria();
		cri.setAmount(10);
		cri.setCurrPage(1);
		
		List<NoticeVO> list = this.service.getList(cri);
		list.forEach(log::info);
		
		int totalCount = this.service.getTotal();
		log.info("totalCount: {}", totalCount);
		
	} // testNoticeGetList
	
//	@Disabled
	@Test
	@Order(2)
	@DisplayName("2. testNoticeGetNotice::")
	@Timeout(unit = TimeUnit.SECONDS, value = 300)
	public void testNoticeGetNotice() throws ServiceException {
		log.trace("testNoticeGetNotice() invoked.");
		
		NoticeDTO dto = new NoticeDTO();
		dto.setNoticeNum(1);
		
		NoticeVO vo = this.service.getNotice(dto);
		log.info("vo: {}", vo);
	} // testNoticeGetNotice
	
//	@Disabled
	@Test
	@Order(3)
	@DisplayName("3. testNoticeRegister::")
	@Timeout(unit = TimeUnit.SECONDS, value = 300)
	public void testNoticeRegister() throws ServiceException {
		log.trace("testNoticeRegister() invoked.");
		
		NoticeDTO dto = new NoticeDTO();
		dto.setTitle("Notice_Title");
		dto.setContent("Notice_Content");
		dto.setImg("Notice_Img");
		
		boolean isRegister = this.service.register(dto);
		log.info("isRegister: {}", isRegister);
	} // testNoticeRegister
	
} // end class