package com.wthealth.service.hashtag.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.wthealth.service.hashtag.HashTagDao;

@Repository("hashTagDaoImpl")
public class HashTagDaoImpl implements HashTagDao {
	
	///Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	///Constructor
	public HashTagDaoImpl() {
		System.out.println(this.getClass());
	}

	///Method
	@Override
	public void addHashTag() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void getHashTag() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateHashTag() throws Exception {
		// TODO Auto-generated method stub

	}

}
