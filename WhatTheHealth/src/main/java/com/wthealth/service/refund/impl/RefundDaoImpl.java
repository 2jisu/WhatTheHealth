package com.wthealth.service.refund.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.wthealth.common.Search;
import com.wthealth.domain.Refund;
import com.wthealth.service.refund.RefundDao;

@Repository("refundDaoImpl")
public class RefundDaoImpl implements RefundDao {
	
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public RefundDaoImpl() {
		System.out.println(this.getClass());
	}

	@Override
	public void addRefund(Refund refund) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Refund> listRefund(int refundNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Refund getRefund(int refundNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public void updateRefund(Refund refund) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Refund> listRefundAdmin(int refundNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotalCount(Search search) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}


}
