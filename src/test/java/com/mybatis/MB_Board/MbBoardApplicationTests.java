package com.mybatis.MB_Board;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class MbBoardApplicationTests {

	@Autowired
	private ApplicationContext context;

	@Autowired
	SqlSessionFactory sessionFactory;

	@Test
	void contextLoads() {
	}

	@Test
	public void testByApplicationContext() {
		try {
			System.out.println("=============================");
			System.out.println(context.getBean("sqlSessionFactory"));
			System.out.println("=============================");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testSqlSessionFactory() {
		try {
			System.out.println("=============================");
			System.out.println(sessionFactory.toString());
			System.out.println("=============================");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
