package com.wthealth.service.claim.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.wthealth.service.claim.ClaimDao;

@Repository("claimDaoImpl")
public class ClaimDaoImpl implements ClaimDao {

	///Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	///Constructor
	public ClaimDaoImpl() {
		System.out.println(this.getClass());
	}

	///Method
	
	@Override
	public void listClaim() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void addClaim() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateClaim() throws Exception {
		// TODO Auto-generated method stub

	}

}
