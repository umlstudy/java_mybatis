package com.sample.mybatis;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

/**
 * @author fffffff
 *
 * 참고용
 */
public class MyBatisTest {
	@Test
	public void shouldDemonstrateDuplicateResourceIssue() throws Exception {
		final String resource = "org/apache/ibatis/submitted/duplicate_resource_loaded/Config.xml";
		final Reader reader = Resources.getResourceAsReader(resource);
		final SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		final SqlSessionFactory factory = builder.build(reader);
		final SqlSession sqlSession = factory.openSession();
		try {
			final UserMapper mapper = sqlSession.getMapper(UserMapper.class);
			mapper.getAllUsers();
		} finally {
			sqlSession.close();
		}
	}
}
