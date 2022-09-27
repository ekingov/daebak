package com.gogi.finalproject.persistence;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gogi.finalproject.domain.LoginDTO;
import com.gogi.finalproject.domain.UserVO;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	@Override
	public UserVO selectUser(LoginDTO dto) throws Exception {
		log.trace("selectUser({}) invoked", dto);
		
		SqlSession sqlSession = this.sqlSessionFactory.openSession();
		
		try(sqlSession) {
			String namespace = "com.gogi.finalproject.persistence.UserDAO";
			String sqlId = "selectUser";
			
			String sql = namespace + "." + sqlId;
			
			return sqlSession.<UserVO>selectOne(sql, dto);
		}//try-with-resources

	}//selectUser

}//end class
